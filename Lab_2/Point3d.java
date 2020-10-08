public class Point3d extends Point2d{
    private double zCoord;

    public Point3d(double x, double y, double z){
        super.setX(x);
        super.setY(y);
        zCoord = z;
    }

    public Point3d(){
        this (0, 0, 0);
    }

    public double getZ() {
        return zCoord;
    }

    public void setZ(double z) {
        zCoord = z;
    }

    public boolean equals(Point3d objPoint3d){
        double objx = objPoint3d.getX();
        double objy = objPoint3d.getY();
        double objz = objPoint3d.getZ();
        double xCoord = this.getX();
        double yCoord = this.getY();
        if ( (xCoord == objx) && (yCoord == objy) && (zCoord == objz)){
            return true;
        }
        return false;
    }

    public double distanseTo(Point3d objPoint3d) {
        double objx = objPoint3d.getX();
        double objy = objPoint3d.getY();
        double objz = objPoint3d.getZ();
        double xCoord = this.getX();
        double yCoord = this.getY();
        return Math.sqrt(Math.pow(objx - xCoord, 2) + Math.pow(objy - yCoord, 2) + Math.pow(objz - zCoord, 2));
    }
}
