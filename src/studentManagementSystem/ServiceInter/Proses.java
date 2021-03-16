package studentManagementSystem.ServiceInter;

public interface Proses {
    public abstract void processLogic();

    public default void process() {
        processLogic();
    }
}