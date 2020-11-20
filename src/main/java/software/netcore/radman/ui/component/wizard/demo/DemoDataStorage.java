package software.netcore.radman.ui.component.wizard.demo;

import lombok.Getter;
import lombok.Setter;
import software.netcore.radman.buisness.service.nas.dto.NasDto;
import software.netcore.radman.ui.component.wizard.DataStorage;

/**
 * @author daniel
 * @since v. 1.0.3
 */
@Getter
@Setter
public class DemoDataStorage implements DataStorage {

    private NasDto nasDto;

}
