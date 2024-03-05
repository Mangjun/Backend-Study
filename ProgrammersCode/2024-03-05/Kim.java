class Kim {
    public int solution(String s) {
        String[] number = {"zero", "one", "two",
                           "three", "four", "five", "six", "seven",
                          "eight", "nine"};
        
        int length = number.length;
        
        for(int i=0; i < length; i++) {
            if(s.contains(number[i])) {
                s = s.replace(number[i], String.valueOf(i));
            }
        }
        
        int answer = Integer.parseInt(s);
        return answer;
    }
}