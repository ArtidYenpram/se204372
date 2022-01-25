
import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {

        groupMembers = new Vector<String>();
        groupMembers.add("Artid"); //PUT YOUR NAME HERE
        groupMembers.add("Chanwit");
        groupMembers.add("Jittipon"); //PUT YOUR NAME HERE
        groupMembers.add("Rattanamon");
	groupMembers.add("Thanakorn");
    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}
