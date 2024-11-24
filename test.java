class test{
  public static void main(String[] args){
    int[] arr = {3,7,9,6,4,7};

    int[] hashing = new int[20];

    for(int i=0;i<=5;i++){
      hashing[arr[i]]++;
    }

    // find number freqency
    System.out.print("Four comes in "+hashing[3] );
  }
}