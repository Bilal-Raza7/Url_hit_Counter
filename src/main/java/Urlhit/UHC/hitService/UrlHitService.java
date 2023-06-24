package Urlhit.UHC.hitService;

import Urlhit.UHC.model.Visit;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class UrlHitService {
    public HashMap<String,Integer> map= new HashMap<>();

    public Visit getvisitor(String username){
        if(map.containsKey(username)){
            map.put(username, map.get(username)+1);
        }else{
            map.put(username,1);
        }
        Visit visit = new Visit(username,map.get(username));
        return visit;
    }
    public HashMap<String,Integer> getAllvisitors(){
        return map;
    }
}
