public class T423 {
    public String originalDigits(String s) {
        int[] array = new int[26];
        for(char c : s.toCharArray()){
            array[c-'a']++;
        }
        int[] num = new int[10];
        String[] strings = new String[]{"one","two","three","four","five","six","seven","eight","nine"};

         num[0] = array[25];
         num[2] = array[22];
         num[4] = array[20];
         num[6] = array[23];
         num[8] = array[6];
         num[1] = array[14] -num[0] - num[2] - num[4];
         num[3] = array[7] - num[8];
         num[5] = array[5] - num[4];
         num[7] = array[21] - num[5];
         num[9] = array[8] - num[5] - num[6] - num[8];

        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<10; i++){
            for(int j=0; j<num[i]; j++){
                stringBuilder.append(strings[i]);
            }
        }

        return stringBuilder.toString();
    }
}
