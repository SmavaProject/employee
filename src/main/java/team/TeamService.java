package team;

import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface TeamService {

    public TeamResponse uploadTeams(MultipartFile file);
    public boolean validateHeaderAndSize(List<CSVRecord> records, List<String> header );
}
