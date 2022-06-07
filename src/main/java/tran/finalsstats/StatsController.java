package tran.finalsstats;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StatsController {
    private  static Map<Integer, Stat> statRepo = new HashMap<>();
    static {
        Stat tatum = new Stat();
        tatum.setId(1);
        tatum.setPlayer("jayson tatum");
        tatum.setSeriesGameNumber(1);
        tatum.setStat("21 points");
        statRepo.put(tatum.getId(), tatum);

        Stat curry = new Stat();
        curry.setId(2);
        curry.setPlayer("steph curry");
        curry.setSeriesGameNumber(1);
        curry.setStat("30 points");
        statRepo.put(curry.getId(), curry);
    }

    // public ResponseEntity<Object>
}
