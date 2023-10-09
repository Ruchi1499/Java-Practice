    public class Remote {

        private static Remote remote;

        // contructor call while initializing object

        private Remote(){

        }
        public static Remote getRemote() {
            // create object of this class
            if (remote == null) {
                remote = new Remote();
            }
            return remote;
        }
     }
