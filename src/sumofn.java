class multithreadimplements1 implements Runnable
{
    private int threadNum;
    public int sum_num=0;
    private int start;
    private int end;

    public multithreadimplements1(int n,int start,int end)
    {
        this.threadNum = n;
        this.start = start;
        this.end = end;
    }

    public void run()
    {
        for(int i = start; i<=end; i++)
        {
            sum_num += i;
        }
    }
}

public class sumofn
{
    public static void main(String args[])
    {
        int num=1000;
        int n=4;

        int d = num / n;

        int start = 1;
        int end = 0;

        multithreadimplements1 [] arr = new multithreadimplements1[n];

        int ans=0;


        for(int i = 0;i<n;i++)
        {
            end = end+d;

            arr[i] = new multithreadimplements1(i,start,end);
            Thread myThread = new Thread(arr[i]);

            myThread.start();
            start = start+d;

            if(i==n-1)
            {
                try
                {
                    myThread.join();
                }
                catch(InterruptedException e){}
            }
        }

        for(int i=0;i<n;i++)
        {
            ans += arr[i].sum_num;
        }

        System.out.println(ans);
    }
}