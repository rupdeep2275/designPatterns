public class GoogleMaps {
    public void findPath(String from, String to, String mode){
        //if (mode == ...) {
        //......
        //} else if (mode == ....) {
        //......
        //} -> Violates SRP, OCP
        PathCalculatorStrategy pc = PathCalculatorFactory.getPathCalulatorStrategy(mode);
        pc.findPath(from, to);
    }
}
