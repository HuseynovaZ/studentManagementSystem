package studentManagementSystem.ServiceInter;

import studentManagementSystem.bean.Config;

public interface SaveableProcess extends Proses {
    public default void process() {
        processLogic();
        Config.save();
    }

}
