package acecam;

import com.mysql.cj.xdevapi.JsonArray;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Chathura on 4/8/2019.
 */
@Controller
@RequestMapping(path="/ACECAM-api-service")
public class MainController {
    @Autowired
    private MainInventoryDataRepository mainInventoryDataRepository;
    private static final String SUCCESS= "success";



    @GetMapping(path="/all/Json")
    public @ResponseBody Iterable<MainInventoryData> getInventoryData() {
        return mainInventoryDataRepository.findAll();
    }

    @GetMapping(path="/addInventory/Json")
    public @ResponseBody JSONObject addData() {
        MainInventoryData mainInventoryData = new MainInventoryData();
        mainInventoryData.setType("Stock");
        mainInventoryData.setStockNumber("BA0B04X001");
        mainInventoryData.setMasterLocation("KOTUGODA");
        mainInventoryData.setCostCenter("336");
        mainInventoryData.setCostCode("A4000");
        mainInventoryData.setOrderRule("T");
        mainInventoryData.setIssuePrice("1.00");
        mainInventoryData.setTotalOH("5.0000");
        mainInventoryData.setExtendedDescription("");
        mainInventoryData.setDescription("Closing coil 48VDC - ABB ER 12 Circuit Breaker Mechanism");
        mainInventoryData.setAssetGroup("");
        mainInventoryData.setStockGroup("BA");
        mainInventoryData.setOldLedgerNumber("KO-0599");
        mainInventoryData.setSerializeCounter("100001");
        mainInventoryDataRepository.save(mainInventoryData);
        return generateJsonSuccessMessageWithRandomToken();
    }

    private JSONObject generateJsonSuccessMessageWithRandomToken(){
        JSONObject jsonObject = new JSONObject();
        LocalDate date = LocalDate.now();
        jsonObject.put("status", SUCCESS);
        jsonObject.put("token", givenUsingPlainJava_whenGeneratingRandomStringBounded_thenCorrect());
        jsonObject.put("time", date);
        return jsonObject;
    }

    private String givenUsingPlainJava_whenGeneratingRandomStringBounded_thenCorrect() {
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return  generatedString;
    }


    @GetMapping(path="/findByAutoId/Json")
    public @ResponseBody List<MainInventoryData> getDataByAutoId(@RequestParam Integer id) {
        return mainInventoryDataRepository.findByAutoId(id);
    }

    @GetMapping(path="/findFilterByAutoId/Json")
    public @ResponseBody List<MainInventoryData> getFilteredDataByAutoId(@RequestParam Integer id) {
        return mainInventoryDataRepository.findTopByAutoId(id);
    }





//    @GetMapping(path="/add")
//    public @ResponseBody String addNewPizza(@RequestParam String name, @RequestParam String description, @RequestParam Double price) {
//        PizzaDetails pizzaDetails = new PizzaDetails();
//        pizzaDetails.setName(name);
//        pizzaDetails.setDescription(description);
//        pizzaDetails.setPrice(price);
//        pizzaRepository.save(pizzaDetails);
//        return SUCCESS;
//    }
//
//
//    @GetMapping(path="/deleteByPizzaId")
//    public @ResponseBody List<PizzaDetails> deletePizzaById(@RequestParam Integer id) {
//        return pizzaRepository.deleteByPizzaId(id);
//    }


//    @GetMapping(path="/update")
//    public @ResponseBody List<PizzaDetails> updatePizzaDetails(@RequestParam Integer id, @RequestParam String name, @RequestParam String description, @RequestParam Double price) {
//        //First get all the pizza details according to the provided ID
//        List<PizzaDetails> pizzaDetailsList = pizzaRepository.findByPizzaId(id);
//        if(!pizzaDetailsList.isEmpty()) {
//            //Iterate through the pizza list
//            for(PizzaDetails pizzaDetails: pizzaDetailsList) {
//                //Set new values
//                pizzaDetails.setName(name);
//                pizzaDetails.setDescription(description);
//                pizzaDetails.setPrice(price);
//                //Update existing pizza item
//                pizzaRepository.save(pizzaDetails);
//            }
//        }
//        return pizzaRepository.findByPizzaId(id);
//    }
}
