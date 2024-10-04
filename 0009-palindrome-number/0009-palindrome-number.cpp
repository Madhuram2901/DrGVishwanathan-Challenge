class Solution 
{
    public:
        bool isPalindrome(int x) 
        {
            int m,r;
            long rn=0;
            m = x;
            while (x>0)
            {
                r=x%10;
                rn = (rn*10) +r;
                x=x/10;
            }
            if (rn == m)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
};