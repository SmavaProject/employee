package team;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    TeamService teamService;

    private static final Logger logger = LoggerFactory.getLogger(TeamController.class);

    @RequestMapping(method= RequestMethod.POST, value="/import")
    public TeamResponse uploadTeams(@RequestParam MultipartFile file){
        return teamService.uploadTeams(file);
    }
}
