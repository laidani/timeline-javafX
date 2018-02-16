package dz.laidani;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author laidani.youcef
 */
@Builder(toBuilder = true) @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class TimeLineUnit {
    
    private int id;
    private String title;
    private String details;
    private LocalDateTime dateTime;
}
