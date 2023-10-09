
public class Main {

    public static void main(String[] args) {


        //Lazy Method of singleton
        System.out.println("Hello world!");
        Remote remote1 = Remote.getRemote();
        System.out.println(remote1.hashCode());
        Remote remote2 = Remote.getRemote();
        System.out.println(remote2.hashCode());


        //Eager Method of singleton
        RemoteEager member1 = RemoteEager.getRemoteEager();
        System.out.printf("member 1 has remote hash no. : %d\n",member1.hashCode());
        RemoteEager member2 = RemoteEager.getRemoteEager();
        System.out.printf("member 2 has remote hash no. : %d\n",member2.hashCode());

    }
}

