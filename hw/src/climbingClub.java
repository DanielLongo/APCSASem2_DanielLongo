public class climbingClub {
    private list<ClimbInfo> climbList;
    public void addClimb(String peakName, int climbTime) {
        climbInfo.add(new ClimbInfo(peakName, climbTime));
    }

    public void swap(int a,int  b) {
        ClimbInfo temp = climbList.get(a);
        climbList.set(b, a);
        climbList.set(a, temp);

    }
    public void addClimbAlpha(String peakName, int climbTime) {
        int targetIndex = 0;
        climbList.add(new ClimbInfo(peakName, climbTime));
        for (int i = 0; i < climbInfo.size
            if (peakName.compareTo (climbInfo.get(i))) {
                targetIndex = i
            }
            if (!peakName.compareTo (climbInfo.get(i))) {
                break;
            }
        }
        this.swap(climbList.size(), targetIndex)

}
//for c
//no and yes
