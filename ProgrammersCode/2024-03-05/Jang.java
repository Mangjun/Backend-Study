class Jang {
    public int solution(String s) {
        String[] number = {"zero", "one", "two", "three", "four", "five",
                          "six", "seven", "eight", "nine", "ten"};
        for (int i = 0; i < number.length; i++) {
            s = s.replace(number[i], i+"");
        }
        
        return Integer.parseInt(s);
    }
}