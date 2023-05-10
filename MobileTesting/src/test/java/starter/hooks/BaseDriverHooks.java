package starter.hooks;

import org.junit.After;
import test.alta.driver.DriverPool;

import java.util.Optional;

public class BaseDriverHooks {
    public DriverPool driverPool = new DriverPool();

    @After
    public void afterTest(){
        quitAndroidDriver(driverPool);
    }
    public void quitAndroidDriver(DriverPool drivers){
        Optional.ofNullable(drivers.getAndroidDriver()).ifPresent(
                driver ->{
                    driver.quit();
                    drivers.setAndroidDriver(null);
                }
        );
    }
}
