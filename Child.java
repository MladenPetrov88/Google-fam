package Task6;

    public class Child {
        private String name;
        private String birthday;

        Child(String name, String birthday) {
            this.name = name;
            this.birthday = birthday;
        }

        public String getName() {
            return this.name;
        }

        public String getBirthday() {
            return this.birthday;
        }

        public String toString() {
            return String.format("%s %s", this.getName(), this.getBirthday());
        }
    }
