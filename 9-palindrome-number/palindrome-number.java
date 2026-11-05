class Solution {
    public boolean isPalindrome(int x) {
  if(x<0){
    return false;
  }
  String str=String.valueOf(x);
  char[]arr=str.toCharArray();
  int start=0;
  int end=arr.length-1;
  while(start<end){
    if(arr[start]!=arr[end]){
        return false;
    }
  
    start++;
    end--;
  }
    return true;
  }
  

}
  


    