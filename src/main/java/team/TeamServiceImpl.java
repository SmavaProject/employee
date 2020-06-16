package team;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Override
    public TeamResponse uploadTeams(MultipartFile file) {
/*
        try(InputStream is = file.getInputStream();) {
            Reader reader = new InputStreamReader(is);

  //          try (Reader reader = Files.newBufferedReader(Paths.get(PATH))) {
                CSVParser parser = new CSVParser(reader, CSVFormat.RFC4180.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());

                int rowCount = 0;

                //int len = parser.getRecords().size();
                //System.out.println("len " + len);

                List<CSVRecord> records = parser.getRecords();
                List<String> header = parser.getHeaderNames();
                System.out.println("records " + records.size());
                boolean validHeaderAndSize = validateHeaderAndSize(records, header);

                System.out.println("valid " + validHeaderAndSize);
                if (validHeaderAndSize) {
                    // try (CSVParser parser = new CSVParser(reader, CSVFormat.RFC4180);){
                    for (CSVRecord record : records) {
                        String teamName = record.get("Team name");
                        String userUniqueName = record.get("User uniquename");
                        String teamRole = record.get("Team member role");

                        rowCount++;

                        System.out.println(
                                "record info: " + teamName + " " + userUniqueName + " " + teamRole + " , row count: " + rowCount);
                    }
                }

        }catch (Exception e){
            e.printStackTrace();
        }
*/
        return new  TeamResponse();
    }

    @Override
    public boolean validateHeaderAndSize(List<CSVRecord> records, List<String> header ) {
        return false;
    }
}
