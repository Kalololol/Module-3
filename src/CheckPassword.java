public class CheckPassword {
    //Używając metodologii TDD napisz testy oraz klasę weryfikującą hasła, która sprawdza, czy hasło
    // ma długość conajmniej 12 znaków,
    // nie ma białych znaków,
    // żadne znaki koło siebie się nie powtarzają,
    // zawiera conajmniej jeden numer
    // oraz znak specjalny(!.@-;”(){}[]?):
    //public boolean hasGoodLength(String password);
    //public boolean hasNoWhiteSpaces(String password);
    //public boolean hasNoRepetitions(String password);
    //public boolean hasNumbers(String password);
    //public boolean hasSpecialCharacter(String password).
    public boolean hasGoodLength(String password){
        return password.length() > 11;
    }
    public boolean hasNoWhiteSpaces(String password){
        return !password.contains(" ");
    }
    public boolean hasNoRepetitions(String password){
        for(int i = 1; i < password.length(); i++){
            char first = password.charAt(i-1);
            char second = password.charAt(i);
            if(first == second){
                return false;
            }
        }
        return true;
    }
    public boolean hasNumbers(String password){
        int sumNumbers = 0;
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
            for (String num : numbers){
                if(password.contains(num)){
                    sumNumbers++;
                }
            }
            if(sumNumbers > 0){
                return true;
            }
                return false;
    }
    public boolean hasSpecialCharacter(String password){
        int sumNumbers = 0;
        String[] specialChar = {"!", ".", "@", "-", ";", "”", "(", ")", "{", "}", "[", "]", "?"};
        for (String sChar : specialChar){
            if(password.contains(sChar)){
                sumNumbers++;
            }
        }
        if(sumNumbers > 0){
            return true;
        }
        return false;
    }



}
