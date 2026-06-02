public class PasswordValidator{
        private String password;
        public PasswordValidator(){
                
        }

        public void setPassword(String password){
                this.password = password;
        }
        public void validate()  throws WeakPasswordException{
                int flag = 1;
                String errorMessage = "\nPassword is weak.\nPassword rules failed to match:: \n";
                if(password.length() < 8){
                        errorMessage = errorMessage.concat("Minimum length of password should be atleast 8 character\n");
                        flag = 0;
                }

                if(!password.matches(".*\\d.*")){
                        errorMessage = errorMessage.concat("Password must contain atleast one digit.\n");
                        flag = 0;
                }
                if(!password.matches(".*[A-Z].*")){
                        errorMessage = errorMessage.concat("Password must contain atleast one upper case\n");
                        flag = 0;

                }
                if(!password.matches(".*[^a-zA-Z0-9 ].*")){
                        errorMessage = errorMessage.concat("Password must contain atleast one special char.");
                        flag = 0;
                }

                if(flag == 0){
                        throw new WeakPasswordException(errorMessage);
                }
                else{
                        System.out.println("Your password is Strong");
                }

        }
}
