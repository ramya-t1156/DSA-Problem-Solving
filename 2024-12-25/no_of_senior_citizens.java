class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        String age;
        int age2;
        for(int i = 0;i<details.length;i++){
            age = details[i].substring(11,13);
            age2 = Integer.parseInt(age);
            if(age2>60){
                count++;
            }
        }
        return count;
    }
}
