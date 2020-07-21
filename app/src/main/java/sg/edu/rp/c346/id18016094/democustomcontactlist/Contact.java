package sg.edu.rp.c346.id18016094.democustomcontactlist;

    public class Contact {
        private String name;
        private int CountryCode;
        private int phoneNum;
        private char gender;

        public Contact(String name, int countryCode, int phoneNum, char gender) {
            this.name = name;
            CountryCode = countryCode;
            this.phoneNum = phoneNum;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCountryCode() {
            return CountryCode;
        }

        public void setCountryCode(int countryCode) {
            CountryCode = countryCode;
        }

        public int getPhoneNum() {
            return phoneNum;
        }

        public void setPhoneNum(int phoneNum) {
            this.phoneNum = phoneNum;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }
    }
