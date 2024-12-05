import java.util.HashMap;
class hashingUsingHashmap{
    public static void main(String[] args){
        int[] myarr = {3,7,9,4,6,3};

        HashMap<Integer , Integer> hashing = new HashMap<>();

        for(int i=0;i<myarr.length;i++){
            if(hashing.containsKey(myarr[i])){             // yee check kara hai..agar phle sa present hoga toh add krdo..
                hashing.put(myarr[i],hashing.get(myarr[i])+1);
            }else{
                hashing.put(myarr[i],1);
            }
        }

        // printing all key value pairs
        hashing.forEach((key,value) ->{
            System.out.println("key: "+key + " value: "+value);
        });

        System.out.print(hashing.get(3));
    }
}