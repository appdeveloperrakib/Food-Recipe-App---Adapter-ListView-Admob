package com.appdeveloperrakib.tastydishes.Helper;

import android.content.Context;

import com.appdeveloperrakib.tastydishes.R;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeCategoryList {


    public static Context context;
    public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;

    public static ArrayList<HashMap<String , String >> foodsArrayList;
    public static ArrayList<HashMap<String , String >> catArrayList;
    public static HashMap<String , String > hashMap;




    public MakeCategoryList(Context context) {
        this.context = context;
    }

    public static void foodsTable(String title, String description, String drawable){

        hashMap = new HashMap<>();
        hashMap.put("Title",title);
        hashMap.put("description", description);
        hashMap.put("img_url", drawable);
        foodsArrayList.add(hashMap);


    }

    public static void CatList(String cat_name, Integer drawable){

        rootArrayList.add(foodsArrayList);
        hashMap = new HashMap<>();
        hashMap.put("cat_name",cat_name);
        hashMap.put("cat_image", String.valueOf(drawable));
        catArrayList.add(hashMap);
        foodsArrayList = new ArrayList<>();


    }

    public static void CreateCatAndFoodsList(){

        rootArrayList = new ArrayList();
        catArrayList = new ArrayList<>();
        foodsArrayList = new ArrayList<>();


        foodsTable("Kung Pao Chiken",context.getString(R.string.Kung_Pao_Chicken_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Chinese/kung_pao_chicken.jpg");
        foodsTable("Mapo Tofu", context.getString(R.string.Mapo_Tofu_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Chinese/mapo_tofu.jpeg");
        foodsTable("Sweet and Sour Park", context.getString(R.string.Sweet_and_Sour_Pork_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Chinese/sweet_and_sour_pork.jpeg");
        foodsTable("Peaking Duck", context.getString(R.string.Peaking_Duck_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Chinese/peking_duck.jpeg");
        foodsTable("Fried Rice", context.getString(R.string.Fried_Rice_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Chinese/fried_rice.jpg");
        foodsTable("Congee", context.getString(R.string.Congee_Resipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Chinese/congee.jpg");
        foodsTable("General Tso\'s Chicken", context.getString(R.string.General_Tsos_Chiken_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Chinese/general_tos_chiken.jpg");
        foodsTable("Wonton Soup", context.getString(R.string.Wonton_Soup_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Chinese/wonton_soup.jpg");
        foodsTable("Beef with Broccoli", context.getString(R.string.Beef_with_Broccoli_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Chinese/beef_with_broccoli.jpeg");
        foodsTable("Beef Noodle Soup", context.getString(R.string.Beef_Noodle_Soup_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Chinese/beef_noodle_soup.jpeg");
        foodsTable("Salt and Pepper Shrimp", context.getString(R.string.Salt_and_Pepper_Shrimp_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Chinese/salt_and_pepper_shrimp.jpg");
        foodsTable("Egg Drop Soup", context.getString(R.string.Egg_Drop_Soup_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Chinese/egg_drop_soup.jpeg");
        foodsTable("Douhua (Tofu Pudding)", context.getString(R.string.Douhua_Tofu_Pudding_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Chinese/tofu_pudding_douhua.jpg");
        foodsTable("Turnip Cake ( Lo Bak Go)", context.getString(R.string.Turnip_Cake_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Chinese/turnip_cake.jpg");
        foodsTable("Beef and Black Bean Sauce", context.getString(R.string.Beef_and_Black_Bean_Sauce_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Chinese/beef_and_black_bean.jpg");
        CatList("Chinese", R.drawable.chinese);

        //----------------------------------------------------

        foodsTable("Sushi",context.getString(R.string.Sushi_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Japnese/sushi.jpg");
        foodsTable("Tempura",context.getString(R.string.Tempura_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Japnese/tempura.jpg");
        foodsTable("Ramen",context.getString(R.string.Ramen_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Japnese/ramen.jpg");
        foodsTable("Miso Soup",context.getString(R.string.Miso_Soup_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Japnese/miso.jpg");
        foodsTable("Teriyaki Chicken",context.getString(R.string.Teriyaki_Chicken_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Japnese/teriyaki.jpg");
        foodsTable("Pork Tonkatsu",context.getString(R.string.Pork_Tonkatsu_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Japnese/pork_tonkatsu.jpg");
        foodsTable("Beef Sukiyaki",context.getString(R.string.Beef_Sukiyaki_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Japnese/beef_sukiyaki.jpg");
        foodsTable("Okonomiyaki",context.getString(R.string.Okonomiyaki_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Japnese/okonomiyaki.jpg");
        foodsTable("Chawanmushi",context.getString(R.string.Chawanmushi_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Japnese/chawanmushi.jpg");
        foodsTable("Yakitori",context.getString(R.string.Yakitori_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Japnese/yakitori.jpg");
        foodsTable("Gyoza",context.getString(R.string.Gyoza_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Japnese/gyoza.jpg");
        foodsTable("Nikujaga",context.getString(R.string.Nikujaga_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Japnese/nikujaga.jpeg");
        foodsTable("Zaru Soba",context.getString(R.string.Zaru_Soba_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Japnese/zaru_soba.jpg");
        foodsTable("Katsudon ",context.getString(R.string.Katsudon_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Japnese/katsudon.jpg");
        foodsTable("Unagi don ",context.getString(R.string.Unagi_don_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Japnese/unagi_don.jpeg");


        CatList("Japanese", R.drawable.japanese);

        //----------------------------------------------------

        foodsTable("Pizza Margherita", context.getString(R.string.Pizza_Margherita_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Italian/pizza_margherita.jpg");
        foodsTable("Pizza Dough", context.getString(R.string.Pizza_Dough_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Italian/pizzadough.jpg");
        foodsTable("Spaghetti Carbonara", context.getString(R.string.Spaghetti_Carbonara_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Italian/spaghetti_carbonara.jpg");
        foodsTable("Risotto", context.getString(R.string.Risotto_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Italian/risotto.jpg");
        foodsTable("Lasagna", context.getString(R.string.Lasagna_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Italian/Lasagna.jpg");
        foodsTable("Ravioli", context.getString(R.string.Ravioli_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Italian/ravioli.jpg");
        foodsTable("Osso Buco", context.getString(R.string.Osso_Buco_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Italian/osso_buco.jpg");
        foodsTable("Fettuccine Alfredo", context.getString(R.string.Fettuccine_Alfredo_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Italian/fetticcine.jpeg");
        foodsTable("Bruschetta", context.getString(R.string.Bruschetta_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Italian/bruschetta.jpg");
        foodsTable("Tiramisu", context.getString(R.string.Tiramisu_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Italian/tiramisu.jpg");
        foodsTable("Gnocchi", context.getString(R.string.Gnocchi_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Italian/gonocchi.jpg");
        foodsTable("Prosciutto e Melone", context.getString(R.string.Prosciutto_e_Melone_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Italian/prosciutto.jpg");
        foodsTable("Panettone", context.getString(R.string.Panettone_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Italian/panettone.jpg");
        foodsTable("Minestrone", context.getString(R.string.Minestrone_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Italian/minestrone.jpg");
        foodsTable("Bolognese Sauce",context.getString(R.string.Bolognese_Sauce_Recipe ),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Italian/bolognese.jpg");

        CatList("Italian", R.drawable.italian);

        //----------------------------------------------------

        foodsTable("Biryani", context.getString(R.string.Biryani_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Bangladeshi/biryani.jpg");
        foodsTable("Panta Bhat (Fermented Rice)",context.getString(R.string.Panta_Bhat_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Bangladeshi/panta_bhat.jpeg");
        foodsTable("Bhuna Khichuri", context.getString(R.string.Bhuna_Khichuri_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Bangladeshi/bhuna_khichuri.jpg");
        foodsTable("Chingri Malai Curry (Prawn Coconut Curry)",context.getString(R.string.Chingri),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Bangladeshi/Chingri-Malai-Curry.jpg");
        foodsTable("Fuchka (Puchka/Pani Puri)", context.getString(R.string.Fuchka),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Bangladeshi/Fuchka-1.jpg");
        foodsTable("Bhapa Pitha", context.getString(R.string.Bhapa_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Bangladeshi/Bhapa_Pita.jpeg");
        foodsTable("Ilish Bhapa", context.getString(R.string.Ilish_Bhapa_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Bangladeshi/ilish_Bhapa.jpg");
        foodsTable("Kacchi Biryani", context.getString(R.string.Kacchi_Biryani_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Bangladeshi/Kacchi_Mutton_Biryani.jpg");
        foodsTable("Pati Shapta", context.getString(R.string.Pati_Shapta_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Bangladeshi/pati_shapta.jpg");
        foodsTable("Mishti Doi (Sweet Yogurt)", context.getString(R.string.Mishti_Doi_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Bangladeshi/mishti-doi-.jpg");
        foodsTable("Borhani", context.getString(R.string.Borhani_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Bangladeshi/desi-borhani.jpg");
       foodsTable("Morog Polao", context.getString(R.string.Morog_Polao_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Bangladeshi/Morog-Pulao.jpg");
        foodsTable("Beef Chui Jhal", context.getString(R.string.Beef_Chui_Jhal_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Bangladeshi/Chui-Jhal.jpg ");
        foodsTable("Chitol Maacher Muitha", context.getString(R.string.Chitol_Maacher_Muitha_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Bangladeshi/chital_macher_muitha.jpg");
       foodsTable("Shami Kabab", context.getString(R.string.Shami_Kebab_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Bangladeshi/chicken-shami-kabab.jpg");
        CatList("Bangladeshi", R.drawable.bangladeshi);

        //----------------------------------------------------

        foodsTable("Paneer Tikka", context.getString(R.string.Paneer_Tikka_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Indian/tawa-paneer-tikka.jpg");
        foodsTable("Samosa", context.getString(R.string.Samosa),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Indian/Samosas-on-plate-SQ.jpg");
       foodsTable("Butter Chicken", context.getString(R.string.Butter_Chicken_Recipe),"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Indian/butter-chicken-recipe.jpg");
        foodsTable("Rogan Josh","" +
                        "Servings: "+ "| Cook Time: 2 hrs 30 mins\n\n"+
                "INGREDIENTS : \n"+
                "- 3.5 tbsp ghee , substitute butter (Note 1)\n" +
                "- 1 cinnamon stick\n" +
                "- 6 green cardamom pods , lightly bruised\n" +
                "- 4 cloves\n" +
                "- 1 large onion , finely chopped\n" +
                "- 3 cloves garlic , finely minced\n" +
                "- 1 tbsp ginger , finely grated\n" +
                "- 5 tbsp tomato passata (US: tomato puree/sauce, Note 5)\n" +
                "- 1 tsp salt\n" +
                "- 750g/1.5lb boneless lamb shoulder , cut into 3cm/1.2\" cubes (Note 6)\n" +
                "- 1.5 cups / 375ml chicken stock , salt reduced (broth)\n" +

                "\n" +
                "SPICES:\n" +

                "- 2 tbsp paprika , normal or sweet\n" +
                "- 3/4 tsp chilli powder (or to taste, Note 2)\n" +
                "- 4 tsp ground coriander\n" +
                "- 4 tsp ground cumin\n" +
                "- 2 tsp turmeric powder\n" +
                "- 1/4 tsp nutmeg\n" +
                "- 1 tsp garam marsala (Note 3)\n" +
                "- 1/2 tsp fennel powder (Note 4)\n" +

                "\n" +"FINISHES :\n" +
                "- 1/2 tsp extra garam masala (Note 3)\n" +
                "- 1/2 tsp extra fennel powder\n" +

                "\n" +"SERVING/GARNISH :\n" +
                "- 1/2 cup / 125g plain yoghurt (Greek yogurt fine)\n" +
                "- Chopped coriander leaves, finely shredded ginger, yogurt\n" +
                "- Basmati rice\n" +

                "\n--------------------------\n"+

                "\n" +"DIRECTION:\n" +

                "\n" +
                "1. Melt ghee over medium heat in large heavy based pot. Add cinnamon, cardamom and cloves and cook for one minute.\n" +
                "\n2. Add onion and cook for 7 minutes, stirring frequently, until pieces are golden and starting the brown on the edges.\n" +
                "\n3. Add the garlic and ginger, cook for another minute.\n" +
                "\n4. Stir in the Spices, cook for 30 seconds.\n" +
                "\n5. Mix in the tomato puree and salt, then add stock and mix.\n" +
                "\n6. Add lamb, stir, bring to simmer.\n" +
                "\n7. Place lid on and adjust heat to low or medium low so it's simmering gently.\n" +
                "\n8. Cook 1 hour 45 minutes, giving it an occasional stir, until lamb is quite tender - use 2 forks to check, it should pry apart pretty easily.\n" +
                "\n9. Remove lid, and continue cooking for another 15 minutes (to reduce sauce slightly) - lamb should be very tender by this stage.\n" +
                "\n10. Stir in the Yogurt, the Extra garam marsala and fennel. Cook for another few minutes.\n" +
                "\n11. Serve with basmati rice, sprinkled with fresh coriander leaves and other garnishes if desired. More sides (pictured): Cucumber salad (Note 7) and Easy naan - No Yeast Flatbread\n" +
                "\n" +
                "Recipe Notes:\n" +
                        "\n" +

                "\n1. Ghee is pure butter (butter is actually fat + water), has more intense butter flavour than normal butter. Sold at large grocery stores in Australia, sub with butter.\n" +
                "\n2. Chilli powder - this is pure chilli and it's spicy. This is not \"Chili Powder\" as sold in the US which is a spice mix and not that spicy.\n" +
                "\n3. Garam masala - Indian spice mix sold at large grocery stores nowadays. Sub with curry powder.\n" +
                "\n4. Fennel powder – This is simply ground fennel seeds. If you can only find fennel seeds, toast them carefully on a dry skillet. Then grind using a spice grinder or mortar and pestle. 1 tsp fennel seeds will roughly yield 1/2 tsp of fennel powder. If you cannot find either ground or whole fennel seeds, you can leave this out.\n" +
                "\n5. Tomato passata – Plain pureed tomato. In the US it's called \"tomato puree\" - also what's called \"tomato sauce\" is fine to use (eg Hunts) (Aussies/UK - do not use what we call tomato sauce!).\n" +
                "Substitute: 1 tbsp tomato paste mixed with 4 tbsp water + 1/2 tsp sugar. Or puree canned tomato and measure out 5 tbsp.\n" +
                "\n6. Lamb - shoulder is best, it's marbled with fat so it's beautifully juicy once slow cooked until fall apart tender. Trim big hunks of fat but leave some. You want 750g of lamb after trimming.\n" +
                "\nDo not use leg or other lean cut, it will be dry.\n" +
                "\nIf using bone in, get one around 1.1 - 1.2kg then cut meat off the bone.\n" +
                "\n7. Cucumber Salad pictured in post - use this Herb & Garlic Cucumber Salad, but I cut the cucumber into thicker chunks (for juicier bites), skipped the herb & garlic (the curry has enough flavour!) and sprinkled with coriander.\n" +
                "\n8. Storage and reheating - Keeps up to 5 days in the fridge, or 3 months in the freezer. Like all stews and braises, it's even better the next day! Reheat on the stove or in the microwave. If it seems a little thick, loosen with stock if you have some left, else just water. Adjust seasoning if required – sometimes they need a small salt bump the next day.","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Indian/Rogan-Josh_4.jpg");

        foodsTable("Tandoori Chiken", "Servings: 4 | Cook Time: 40 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- ½ kg chicken\n" +
                "- (500 to 700 grams)\n" +
                "- ½ cup greek yogurt\n" +
                "- (hung curd)\n" +
                "- ¾ tbsp ginger garlic paste\n" +
                "- 1 tsp garam masala\n" +
                "- 1 tsp red chilli powder\n" +
                "- (kashmiri or any low heat chilli)\n" +
                "- ¼ tsp black pepper crushed\n" +
                "- (powder)\n" +
                "- 1 tsp coriander powder\n" +
                "- (daniya powder)\n" +
                "- ¼ tsp salt\n" +
                "- (taste marinade & add more)\n" +
                "- ¼ tsp Turmeric\n" +
                "- (haldi)\n" +
                "- 1 tsp kasuri methi\n" +
                "- (dried fenugreek leaves)\n" +
                "- 1 tbsp lemon juice\n" +
                "- 1½ tbsp oil\n" +
                "- (preferably mustard oil)\n" +
                "\n" +
                "For Grilling :\n" +
                " - 1 tbsp oil\n" +
                "\n" +
                "For color: \n" +
                "\n" +
                "- 1 tsp red chili powder\n" +
                "- 1 to 2 tbsp oil\n" +
                "- (preferably mustard oil)\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "Marinade for tandoori chicken :\n" +
                "\n" +
                "1. To a mixing bowl, add greek yogurt or hung curd (thick curd). If you do not have it make your own following the notes\n" +
                "below.\n" +
                "\n" +
                "2. Next add in ginger garlic paste, garam masala, red chili powder, salt, turmeric, kasuri methi, pepper powder and\n" +
                "coriander powder.\n" +
                "\n" +
                "3. Pour oil and lemon juice as well.\n" +
                "\n" +
                "4. Mix everything well. The marinade has to be thick and not of dripping consistency. Taste it and add more salt and chili\n" +
                "powder if needed.\n" +
                "\n" +
                "5. Make deep gashes over the chicken and add it to the bowl.\n" +
                "\n" +
                "6. Marinate the chicken well into the gashes.\n" +
                "\n" +
                "7. Cover and set aside for at least 6 hours. If you reduce the marination time, chicken will not turn soft and juicy. It may\n" +
                "not get cooked well if making on tawa.\n" +
                "\n" +
                "How to make tandoori chicken :\n" +
                "\n" +
                "1. Preheat the oven to the highest for atleast 15 to 20 mins. In my oven it is 470 F or 240 C. For the stovetop and air\n" +
                "fryer method, please follow the step by step instructions above the recipe card.\n" +
                "\n" +
                "2. Place a foil on a oven tray to collect the drippings.\n" +
                "3. Then keep a greased wired rack on the tray.\n" +
                "\n" +
                "4. Place the chicken pieces over the wire rack.\n" +
                "\n" +
                "5. Grill the chicken for about 15 mins.\n" +
                "\n" +
                "6. For spicy version mix together 1 tsp red chili powder with 1 tbsp oil.\n" +
                "\n" +
                "7. After 15 mins of grillling, baste the red chili oil over the chicken. You can also baste the left over marinade over the\n" +
                "chicken.\n" +
                "\n" +
                "8. Turn the chicken to the other side and baste the red chili oil or marinade.\n" +
                "\n" +
                "9. Grill for another 6 to 10 mins or until the chicken is cooked through. You will need to adjust the timing as it depends on\n" +
                "size of the chicken pieces.\n" +
                "\n" +
                "10. The last 5 mins, set to broil mode. Alternately you can move the entire tray with wire rack to the top most rack for the\n" +
                "last 5 mins. This gives the charred effect.\n" +
                "\n" +
                "11. Brush the drippings all over the chicken. This keeps the chicken moist. You can also burn a char coal piece and place\n" +
                "it in a small cup. Bring out the chicken tray from the oven and place the cup of char coal in the tray. Cover with a large\n" +
                "bowl or foil. Allow it to smoke for 5 to 7 mins.\n" +
                "\n" +
                "12. Restaurant style tandoori chicken is ready. Serve with this Cilantro Chutney or Pudina Mint Chutney alongside onion\n" +
                "and lemon wedges. For a complete meal, serve it with Turmeric rice and Cucumber raita.\n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Indian/tandoori-chicken.jpg");
        foodsTable("Aloo Paratha","Servings: 8 | Cook Time: 45 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "I CUP = 240 ML\n" +
                "\n" +
                "For dough :\n" +
                "- 2 cups whole wheat flour\n" +
                "- (240 grams) (atta)\n" +
                "- ¼ teaspoon salt\n" +
                "- 1 tablespoon oil\n" +
                "- (optional, refer notes)\n" +
                "water\n" +
                "- as needed for kneading (I used ¾ cup + 2 tbsps)\n" +
                "\n" +
                "For filling:\n" +
                "- 350 grams potatoes\n" +
                "- (3 medium potatoes)\n" +
                "- 1 green chilli\n" +
                "- chopped (optional)\n" +
                "- ¾ teaspoon grated ginger\n" +
                "- (or ¼ tsp ginger powder)\n" +
                "- 2 tablespoons coriander leaves\n" +
                "- (very fine chopped)\n" +
                "- ½ teaspoon salt (adjust to taste)\n" +
                "- ½ to ¾ teaspoon garam masala (adjust to taste)\n" +
                "- ½ teaspoon kashmiri red chilli powder\n" +
                "- (adjust to taste)\n" +
                "- ¾ to 1 teaspoon coriander powder\n" +
                "- ½ teaspoon chaat masala\n" +
                "- (or 1 tbsp lemon juice or ½ tsp amchur)\n" +
                "- 1 teaspoon kasuri methi\n" +
                "- (dried fenugreek leaves)\n" +
                "- ¼ teaspoon ajwain\n" +
                "- (carom seeds) (optional)\n" +
                "- ½ teaspoon fennel seeds powder\n" +
                "- (saunf powder) (optional)\n" +
                "\n" +
                "To pan fry:\n" +
                "- 4 tablespoons ghee\n" +
                "(use as per preference)\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "Prepration :\n" +
                "\n" +
                "1. Boil potatoes just until fork tender without making them mushy. To pressure cook in traditional cooker, cook for 3 to 4" +
                " whistles depending on the size of potatoes. In instant pot I pressure cooked for 5 mins since I used medium sized\n" +
                "potatoes.\n" +
                "\n" +
                "2. While the potatoes boil, make the dough. Add flour,oil and salt to a bowl. Pour half cup water and begin to mix to form" +
                " a dough. Pour more water as needed and make a soft yet non-sticky dough.\n" +
                "\n" +
                "3. Knead it well until soft & pliable. If you press down the dough with your finger, it should dent easily meaning it is soft " +
                "enough. Cover and rest until the filling is ready.\n" +
                "\n" +
                "4. When the potatoes are done, cool them slightly and peel while still warm. Ensure your boiled potatoes are not mushy " +
                "or soggy.\n" +
                "\n" +
                "5. Grate or mash them well until no bits of potatoes remain. Using your fingers break any chunks of potatoes left in the " +
                "mash otherwise they will tear the parathas. Also do not over mash it as the potatoes will turn pasty and sticky.\n" +
                "\n" +
                "6. Add ginger, green chilies, coriander leaves, salt, red chilli powder, garam masala, coriander powder, kasuri methi and " +
                "chaat masala. Crush the kasuri methi before adding.\n" +
                "\n" +
                "7. Optional: Also add the optional ingredients - ajwain and fennel powder. " +
                "\n" +
                "8. Mix all of the ingredients gently and taste test it. Add more salt or spices as per your taste. " +
                "\n" +
                "9. Divide the aloo stuffing to 8 parts. Also divide the dough to 8 parts. Keep the dough covered. " +
                "\n" +
                "\n" +
                "How to Make Aloo Paratha :\n" +
                "1. Roll a dough ball in your palms to smooth. Lightly sprinkle some flour on the rolling area. Flatten the dough ball and " +
                "dip it in some flour.\n" +
                "\n" +
                "2. Method 1- Dust off the excess & roll it to a 4 inch disc or roti. Place a portion of aloo stuffing in the center. Gently bring " +
                "the sides of the roti up shaping like a cup. Repeat the steps of pushing the stuffing inside with your finger and bringing " +
                "the dough up until the edges come over the stuffing. (Refer video).\n" +
                "\n" +
                "3. If the stuffing is sticky, dip your fingers in flour. Bring the edges together over the stuffing and join them to seal " +
                "carefully. (Refer step-by-step photo or video).\n" +
                "\n" +
                "4. Method 2 - Roll a 5 inch roti and place the stuffing in the center, hold the edges and make small pleats. Bring all of " +
                "them on top and join them together to seal the stuffing. Remove the excess dough on top.\n" +
                "\n" +
                "5. Dip the stuffed ball in flour and flatten it gently to spread the stuffing evenly. This ensures the stuffing does not come " +
                "out at all. Dust off the excess.\n" +
                "\n" +
                "6. Sprinkle some flour on the rolling area .\n" +
                "\n" +
                "7. Place the paratha disc on the rolling area with the sealed side down. Begin to roll evenly all over without putting " +
                "pressure.\n" +
                "\n" +
                "8. Do not roll the aloo paratha continuously. Instead rotate in clock-wise direction a little after every 4 to 6 rolls to ensure " +
                "it does not tear or get stuck. Sprinkle flour as needed and avoid using excess. If you see the stuffing coming out,\n" +
                "gently apply some flour to seal it.\n" +
                "\n" +
                "9. Roll the aloo paratha as thin or thick you like without tearing them. I roll mine to 8 to 9 inches. " +
                "\n" +
                "10. Transfer the rolled ones to a dry area. Once you are done with 3 you can begin to fry them.\n" +
                "\n" +
                "11. Method 3 - With this method, you will be able to make only 6 large parathas. So divide the dough to 12 and stuffing to " +
                "6 parts. Roll 2 rotis of 6 inches each. Spread the aloo mixture on one of the roti. Wet the edges with little water. Place " +
                "the other roti on top of it. Press down gently on the sides to seal both the rotis. Then sprinkle flour and roll it evenly as " +
                "thin as you want.\n" +
                "\n" +
                "\n" +
                "Frying :\n" +
                "1. Heat a pan or griddle to cook the aloo parathas. The griddle should be hot enough otherwise the parathas will turn " +
                "hard,\n" +
                "\n" +
                "2. When the pan is hot, gently transfer a rolled aloo paratha to it.\n" +
                "\n" +
                "3. With in 2 to 3 mins, you will see bubbles over it. Then flip it to the other side and cook.\n" +
                "\n" +
                "4. You will see the aloo paratha puffs and cooks well. Drizzle ghee or oil all over and flip it to the other side and cook.\n" +
                "\n" +
                "5. Smear some ghee on this side as well and press down the edges to cook thoroughly.\n" +
                "\n" +
                "6. Soon you will see golden to light brown spots on the aloo parathas. Remove to a plate and stack them. This keeps " +
                "them soft.\n" +
                "\n" +
                "7. Top aloo paratha with some butter and serve with pickle or yogurt. This coriander chutney or mint chutney also go " +
                "well.\n"
                ,"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Indian/aloo-paratha-recipe-2.jpg");
        foodsTable("Palak Paneer ","\n" +
                "Servings: 8 | Cook Time: 45 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "I CUP = 240 ML\n" +
                "\n" +
                "- 225 grams (1.88 cups) paneer (Indian cottage cheese)\n" +
                "- 5.25 to 6 cups (150 to 180 grams) palak (spinach)\n" +
                "- 3 tablespoons oil (or half oil & half butter)\n" +
                "- 3 green chilies (deseeded) (less spicy kind)\n" +
                "- 1.13 cup ( 135 grams, 1.5 small) onions (fine chopped)\n" +
                "- 0.75 cup (3 small) tomatoes (deseeded & chopped or pureed)\n" +
                "- 1.13 teaspoon ginger garlic paste (read notes for substitute)\n" +
                "- 1.13 teaspoon salt (adjust to taste)\n" +
                "- 12 to 15 cashewnuts (read notes for substitutes)\n" +
                "- 0.75 to 1.13 teaspoon garam masala (adjust to taste)\n" +
                "- 0.75 teaspoon kasuri methi (dried fenugreek leaves) (skip if you don't have)\n" +
                "- 0.38 cup water to blend spinach\n" +
                "- 1.13 cup water\n" +
                "- to cook the gravy\n" +
                "- 4.5 tablespoons cream(optional)\n" +
                "\n" +
                "(Optional) Whole spices for palak paneer : \n" +
                "- 0.19 teaspoon cumin seeds (jeera) (optional)\n" +
                "- 3 green cardamoms (elaichi) (optional)\n" +
                "- 1.5 inch cinnamon (dalchini) (optional)\n" +
                "- 3 cloves (laung) (optional)\n" +
                "\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "Prepration :\n" +
                "1. Pluck only the young & tender spinach leaves and discard the stems as they may leave a bitter taste. If using baby spinach you can use the stems as well.\n" +
                "\n" +
                "2. Add them to a large pot of water. Rinse them well few times & drain to a colander.\n" +
                "\n" +
                "3. Allow the water to drain completely otherwise it will let out lot of moisture while cooking.\n" +
                "\n" +
                "4. Heat half tablespoon oil in a pan. Saute green chilies, cashews and spinach for 3 to 4 mins until the leaves wilt off thoroughly & raw smell of spinach has gone away. [OR another option is to blanch the palak in 4 cups of hot water with ¼ tsp salt for 2 mins. Then immerse in ice cold water. Drain completely.\n" +
                "\n" +
                "5. Cool this completely. Blend this along with water to a smooth puree. The puree should be smooth and thick. You may add 1 to 2 tbsps more water to help in blending.\n" +
                "\n" +
                "How to make Palak Paneer :\n" +
                "1. Heat 1 tablespoon butter and half tablespoon oil to the same pan, Once they melt, add cinnamon, cardamoms, cloves & cumin seeds.\n" +
                "\n" +
                "2. When the spices begin to sizzle, add onions and fry till they turn transparent to golden.\n" +
                "\n" +
                "3. Next saute ginger garlic paste for 1 to 2 minutes or until you begin to smell it nice.\n" +
                "\n" +
                "4. Then add tomatoes with salt. Saute until they break down and turn mushy.\n" +
                "\n" +
                "5. Add garam masala & saute until the masala smells good. This may take 2 mins. (for a smoother curry refer notes)\n" +
                "\n" +
                "6. Pour water and cook covered until onions are completely soft. There should be some water left in the pan. (for consistency check video)\n" +
                "\n" +
                "7. Lower the flame, add kasuri methi and pureed spinach. Mix well and cook until it begins to bubble for about 2 to 3 mins. If the curry is too thick you may add a few tbsps of hot water.\n" +
                "\n" +
                "8. Avoid overcooking. Add paneer & mix well. Turn off and remove to a serving bowl. Optionally garnish with cream.\n" +
                "\n" +
                "9. Serve palak paneer with naan, roti, Basmati rice or Jeera rice.\n"
                ,"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Indian/palak-paneer.jpg");
        foodsTable("Vada Pav ", "\n" +
                "Servings: 4 | Cook Time: 50 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "For spiced potato stuffing:\n" +
                "- 175 grams potatoes or 2 medium to large sized potatoes\n" +
                "- 3 to 3.5 garlic - small to medium-sized\n" +
                "- 0.5 to 1 green chillies\n" +
                "- 0.25 teaspoon mustard seeds\n" +
                "- 0.5 pinch asafoetida (hing)\n" +
                "- 0.06 teaspoon turmeric powder\n" +
                "- 3.5 to 4 curry leaves\n" +
                "- 0.5 to 1 tablespoons chopped coriander leaves (cilantro leaves) salt as required\n" +
                "\n" +
                "For batter:\n" +
                "- 0.5 to 0.63 cups gram flour (besan)\n" +
                "- 0.5 pinch asafoetida (hing)\n" +
                "- 0.06 teaspoon turmeric powder\n" +
                "- 0.5 pinch baking soda - optional\n" +
                "- 0.25 cup water or add as required\n" +
                "- salt as required\n" +
                "\n" +
                "For green chutney:\n" +
                "- 0.5 cup chopped coriander leaves\n" +
                "- 0.5 to 1 garlic cloves - small to medium-sized, chopped\n" +
                "- 1 to 1.5 drops lemon juice\n" +
                "- 1 to 1.5 green chillies - chopped\n" +
                "- salt as required\n" +
                "\n" +
                "For sweet tamarind chutney:\n" +
                "- 0.25 cup seedless tamarind - tightly packed\n" +
                "- 0.88 cups water or add as required\n" +
                "- 0.25 teaspoon cumin seeds\n" +
                "- 0.25 teaspoon ginger powder (saunth powder)\n" +
                "- 0.5 pinch asafoetida (hing)\n" +
                "- 0.13 teaspoon red chili powder\n" +
                "- 3.5 to 4 tablespoons jaggery powder or grated jaggery - add as required adjusting to your taste\n" +
                "- 0.5 teaspoon oil\n" +
                "- salt or black salt, add as required\n" +
                "\n" +
                "Other ingredients:\n" +
                "- oil as required - for deep frying\n" +
                "- 1 tablespoons dry red chutney - optional\n" +
                "- 4 pav or dinner rolls\n" +
                "- 1.5 to 2 fried green chillies mixed with some salt, optional\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "Making green chutney:\n" +
                "1. Grind all the green chutney ingredients with little water till smooth. Avoid making a watery chutney. \n" +
                "\n" +
                "Making sweet chutney:\n" +
                "1. Soak tamarind in hot water for 30 to 40 minutes.\n" +
                "\n" +
                "2. With your hands, squeeze the pulp from the tamarind in the same bowl or pan. strain the pulp and keep aside.\n" +
                "\n" +
                "3. Heat oil in a small pan. lower the flame & add cumin seeds and let them crackle.\n" +
                "\n" +
                "4. Add ginger powder, red chili powder, asafoetida. Stir and add the strained tamarind pulp. Cook for 2-3 minutes.\n" +
                "\n" +
                "5. Add the jaggery and salt and cook for 4-5 mins more. The mixture would thicken. Let the saunth chutney mixture cool.\n" +
                "\n" +
                "6. When cooled, store the saunth chutney in an air-tight dry jar or container. Refrigerate and serve the saunth chutney whenever required with chaat or snacks.\n" +
                "\n" +
                "Making potato stuffing:\n" +
                "1. Boil or steam potatoes in an Instant pot, pressure cooker or pan until they are completely cooked. Peel and then mash them with a fork in a bowl.\n" +
                "\n" +
                "2. Crush garlic and green chillies to a semi-fine paste in a mortar-pestle.\n" +
                "\n" +
                "3. Heat oil in a small pan. Add mustard seeds and crackle them. Then add curry leaves and asafoetida. Stir and fry for about 5 seconds.\n" +
                "\n" +
                "4. Then add crushed garlic and green chilies paste, which have been crushed in a mortar-pestle. Add turmeric powder. Stir for some seconds until the raw aroma of garlic goes away. Do not brown garlic.\n" +
                "\n" +
                "5. Pour this tempering in the mashed potatoes.\n" +
                "\n" +
                "6. Add chopped coriander leaves and salt.\n" +
                "\n" +
                "7. Mix everything well and then make small to medium balls from the mashed potato mixture. Flatten these balls a bit. Cover and set aside.\n" +
                "\n" +
                "Making batter:\n" +
                "1. In another bowl, make a smooth and thick yet flowing batter from the besan, turmeric powder, asafoetida, a pinch of baking soda (optional), salt and water.\n" +
                "\n" +
                "2. The batter should not be very thick or thin. If the batter becomes thin, add 1 or 2 tablespoons of gram flour. If the batter becomes thin, then add 1 or 2 tablespoons water. Set aside.\n" +
                "\n" +
                "Frying:\n" +
                "1. In a kadai or pan, heat oil for deep frying.\n" +
                "\n" +
                "2. When the oil becomes medium hot, then dip the slightly flattened potato balls in the batter and coat it evenly with the batter.\n" +
                "\n" +
                "3. Gently and carefully add these batter coated potato balls in medium hot oil.\n" +
                "\n" +
                "4. Depending on the size of the kadai or pan, you can add more or less of the vadas while frying. Don't overcrowd the pan while frying.\n" +
                "\n" +
                "5. When one side becomes crisp, lightly golden and firms up then gently turn it over with a slotted spoon and fry the second side. Turn over when the second side is fried.\n" +
                "\n" +
                "6. This way turning a couple of times fry the batata vada till they are evenly golden on all sides.\n" +
                "\n" +
                "7. Drain them on kitchen paper towels. Make all batata vadas this way and keep aside.\n" +
                "\n" +
                "8. When they are still hot or warm, you need to serve them. Take all the chutneys and pav on your work surface.\n" +
                "\n" +
                "Assembling & serving:\n" +
                "1. Slice the pav without breaking it into two parts and keep aside. If you don't have sweet chutney, then just make the vada pav with green chutney.\n" +
                "\n" +
                "2. Spread both the green chutney and sweet chutney on the sliced pav. You can also spread green chutney on one side and sweet chutney on the other side.\n" +
                "\n" +
                "3. Sprinkle the dry garlic chutney. This is optional and if you don't have you can skip it.\n" +
                "\n" +
                "4. Place the hot batata vada sandwiched in the bread slices.\n" +
                "\n" +
                "5. Serve vada pav immediately or else the pav becomes soggy. You can also serve some fried salted green chillies and both the chutney along with it.\n" +
                "\n" +
                "6. You can also serve them as an evening snack with a side of ginger chai or coffee.\n" +
                "\n" +
                "Notes:\n" +
                "1. You can always alter the amount of chutneys you spread in the pav according to your taste and liking.\n" +
                "\n" +
                "2. The oil has to be medium hot when you fry the batata vada. If the oil is very hot then the outside batter will get browned and leaving the inside portion of the batter uncooked. On the other hand, if the oil is not hot enough then the batata vada will absorb a lot of oil making it soggy and loaded with oil.\n" +
                "\n" +
                "3. To make a spicy vada pav, increase the number of chilies in the potato stuffing. Or you can more chilies in the green chutney that you make.\n" +
                "\n" +
                "4. This recipe can be scaled to make a big batch for a party or get togethers.\n"
                ,"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Indian/vada-pav-recipe.jpg");
        foodsTable("Dal Makhani ", "Servings: 4 | Cook Time: 9 hrs\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "I CUP = 240 ML\n" +
                "\n" +
                "Main Ingredients\n" +
                "\n" +
                "- ¾ cup whole urad dal , 140 grams (whole black gram)\n" +
                "- ¼ cup rajma , 40 grams (kidney beans)\n" +
                "- 3 cups water for pressure cooking , 750 ml water\n" +
                "- ½ cup finely chopped onions , 50 grams onion or 1 medium sized onion\n" +
                "- 1 teaspoon chopped green chilies or serrano peppers or 1 to 2 green chillies\n" +
                "- 2 teaspoons Ginger Garlic Paste or 6 to 7 small to medium-sized garlic + 1 inch ginger – crushed to a paste in mortar-pestle\n" +
                "- 2 large tomatoes , 200 grams tomatoes – pureed or 1 cup tomato puree\n" +
                "- ½ teaspoon cumin seeds\n" +
                "- 2 to 3 cloves\n" +
                "- 2 to 3 green cardamoms\n" +
                "- 1 black cardamom\n" +
                "- 1 inch cinnamon\n" +
                "- 1 small to medium tej patta (Indian bay leaf)\n" +
                "- ½ teaspoon red chili powder or cayenne pepper or smoked paprika\n" +
                "- 2 to 3 pinches grated nutmeg or ground nutmeg powder\n" +
                "- 1 cup water or add as required\n" +
                "- ¼ to ⅓ cup low fat cream or half and half or 2 tablespoons heavy cream or\n" +
                "- ¼ teaspoon crushed kasuri methi (dry fenugreek leaves) – optional\n" +
                "- 3 tablespoon Butter – salted or unsalted\n" +
                "- salt as required\n" +
                "\n" +
                "For Dhungar Method (Optional)\n" +
                "- 1 small piece of charcoal\n" +
                "- ½ to ⅔ teaspoon oil – any neutral tasting oil\n" +
                "\n" +
                "For Garnish\n" +
                "- 1 to 2 tablespoons chopped coriander leaves (cilantro)\n" +
                "- ½ tablespoon low fat cream or half and half for garnish – optional\n" +
                "- 1 inch ginger julienne – optional\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "1. Soak both the whole urad dal and rajma overnight in enough water for 8 to 9 hours or overnight. Later drain them well.\n" +
                "\n" +
                "2. Rinse both the lentils a couple of times in water.\n" +
                "\n" +
                "3. Drain again and then add them in a 3 litre pressure cooker. Add water and stir well.\n" +
                "\n" +
                "4. ressure cook for 18 to 20 whistles on a high flame, till both the urad dal and rajma have cooked thoroughly and softened. If they are not cooked, then add about ½ cup water again and pressure cook for 4 to 5 whistles more.\n" +
                "\n" +
                "5. The urad dal should melt in the mouth and should not give any bite or resistance when eaten. You can also just mash the urad dal with a spoon or with your fingers to check the doneness. The same rule applies for rajma too. Keep the cooked beans aside.\n" +
                "\n" +
                "6. In a blender or mixer jar, take chopped tomatoes and blend to a smooth puree. Set aside.\n" +
                "\n" +
                "7. You can also add ready 1 cup tomato puree instead of blending the tomatoes. No need to blanch the tomatoes while pureeing.\n" +
                "\n" +
                "Making Dal Makhani:\n" +
                "1. In a pan, now heat butter. You can use salted butter or unsalted butter.\n" +
                "\n" +
                "2. Add the whole spices – cumin seeds, cloves, green cardamoms, black cardamom, 1 inch cinnamon, 1 small to medium tej patta.\n" +
                "\n" +
                "3. Fry for some seconds till the spices sputter and become aromatic.\n" +
                "\n" +
                "4. Add finely chopped onions.\n" +
                "\n" +
                "5. Stir and sauté the onions on a low or medium-low heat often till they become light golden.\n" +
                "\n" +
                "6. Add the ginger garlic paste. Stir again and sauté for some seconds till the raw aroma of ginger-garlic goes away.\n" +
                "\n" +
                "7. Add the chopped green chilies and sauté for a minute.\n" +
                "\n" +
                "8. Add the prepared tomato puree and mix well.\n" +
                "\n" +
                "9. Add red chili powder and 2 to 3 pinches of grated nutmeg or nutmeg powder.\n" +
                "\n" +
                "10. Stir very well and sauté this mixture on a low to medium flame, till you see fat releasing from the sides.\n" +
                "\n" +
                "11. Then add the cooked urad dal and rajma beans along with the stock. Also add 1 cup water or as required.\n" +
                "\n" +
                "Slow Cooking :\n" +
                "1. Stir very well and simmer the dal makhani uncovered on a low flame.\n" +
                "\n" +
                "2. Keep on stirring often, so that the lentils don’t stuck to the bottom of the pan.\n" +
                "\n" +
                "3. Once it has begun to thicken, add salt as required.\n" +
                "\n" +
                "4. Stir very well and continue to simmer on a low flame. Keep on stirring when the lentils are simmered on low heat.\n" +
                "\n" +
                "5. When simmering you can add more water if the gravy looks thick or dry. The longer you keep dal makhani to simmer, the better it tastes.\n" +
                "\n" +
                "6. I kept it for about an overall 25 minutes on a low flame. Do keep on stirring at intervals.\n" +
                "\n" +
                "7.When the gravy has thickened enough, then add cream. Dal makhani is not too thick or too thin. It has a medium consistency.\n" +
                "\n" +
                "8. Mix the cream very well. Then switch off the heat.\n" +
                "\n" +
                "9. Add crushed kasuri methi (dried fenugreek leaves). Mix again.\n" +
                "\n" +
                "10.Cover and set dal makhani aside, if you are proceeding to the dhungar method. Or else you can serve dal makhni straight away.\n" +
                "\n" +
                "Dhungar Method :\n" +
                "1. Heat a small piece of charcoal on flame till it becomes red hot. With the help of tongs, keep on turning the charcoal piece so that it evenly burns.\n" +
                "\n" +
                "2. Keep the red hot charcoal in a small bowl.\n" +
                "\n" +
                "3. Pour ½ teaspoon oil on the hot charcoal.\n" +
                "\n" +
                "4. Immediately keep this bowl on top of the dal makhani.\n" +
                "\n" +
                "5. Cover for a minute and allow the charcoal to infuse its smoke in the dal makhni. Remove the bowl. Stir again.\n" +
                "\n" +
                "6. Serve punjabi dal makhani garnished with chopped coriander leaves (cilantro) and a few teaspoons of cream with naan, roti, paratha or steamed rice.\n"
                ,"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Indian/dal-makhani.jpg");
        foodsTable("Aloo Tikki ","Servings: 6 | Cook Time: 40 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "For Cooking Potatoes And Green Peas:\n" +
                "- 500 grams potatoes or 4 to 5 large potatoes\n" +
                "- ½ cup green peas – 100 grams, fresh or frozen\n" +
                "- 2.5 cups water\n" +
                "\n" +
                "Other Ingredients For Stuffing\n" +
                "- ¼ teaspoon red chilli powder or cayenne pepper\n" +
                "- ½ teaspoon Coriander Powder (ground coriander)\n" +
                "- ½ teaspoon fennel powder (ground fennel seeds) – optional\n" +
                "- ½ teaspoon dry mango powder or ¼ to ½ teaspoon lemon juice\n" +
                "- 2 teaspoons finely chopped ginger or or 1.5 to 2 inches, ginger or ¼ teaspoon ground ginger powder – can reduce the quantity of chopped ginger\n" +
                "- 1 teaspoon finely chopped green chillies or 1 to 2 green chillies, finely chopped\n" +
                "- 2  tablespoons finely chopped coriander leaves (cilantro)\n" +
                "- 2 pinches black salt\n" +
                "- salt as required\n" +
                "\n" +
                "Ingredients For Potato Patties\n" +
                "- ½ teaspoon red chilli powder or cayenne pepper\n" +
                "- ½ teaspoon Garam Masala or curry powder\n" +
                "- 1 teaspoon Coriander Powder (ground coriander)\n" +
                "- 1 teaspoon dry mango powder or ½ to 1 teaspoon lemon juice\n" +
                "- ½ teaspoon cumin powder (ground cumin) – optional\n" +
                "- ½ teaspoon black salt\n" +
                "- salt as required\n" +
                "- ¼ cup bread crumbs or add as required \n" +
                "- ¼ cup arrow root flour or add as required\n" +
                "- 2 tablespoons chopped coriander leaves (cilantro)\n" +
                "- 4 to 5 tablespoons oil for frying the tikki or add as required\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "1. The potatoes and green peas have to be cooked together first. You can choose to leave out cooking green peas if you do not want to stuff the patties.\n" +
                "\n" +
                "Cooking In Stovetop Pressure Cooker:\n" +
                "1. In a 3 or 4 litre stovetop pressure cooker take 4 to 5 large potatoes and 2.5 cups water.\n" +
                "\n" +
                "Place a small trivet and keep a bowl containing ½ cup green peas in it. Pressure cook for 5 to 6 whistles on medium to medium-high flame.\n" +
                "\n" +
                "Remove the cooker's lid after all the pressure falls naturally in the cooker.\n" +
                "\n" +
                "\n" +
                "Cooking In Instant Pot:\n" +
                "1. Take the trivet that comes with the Instant pot package. Place this trivet in the steel insert of a 6 quart IP. Add 2.5 cups of water.\n" +
                "\n" +
                "On top of the trivet, Place 4 to 5 large potatoes and also keep a small bowl containing ½ cup green peas.\n" +
                "\n" +
                "Pressure cook on high for 20 to 25 minutes in the Instant Pot. Do a quick pressure release after 5 to 7 minutes after the cooking is complete.\n" +
                "\n" +
                "2. Check with a knife or fork to see if the potatoes are tender and cooked well. The fork or knife should be able to slid easily if the potatoes are cooked properly.\n" +
                "\n" +
                "Making Green Peas Stuffing:\n" +
                "1. Drain the water from the steamed green peas using a small strainer or colander. Take the peas in a bowl and mash them.\n" +
                "\n" +
                "2. Mash to a coarse texture.\n" +
                "\n" +
                "3. To the peas, add red chilli powder or cayenne pepper, coriander powder, fennel powder, dry mango powder, finely chopped ginger, green chillies, coriander leaves, black salt and regular salt as per taste.\n" +
                "\n" +
                "4. Mix very well. Check taste and add more salt or the ground spice powders if required.\n" +
                "\n" +
                "Making Potato Patty Mixture:\n" +
                "1. Meanwhile drain the water from the potatoes as well and let them become warm.\n" +
                "\n" +
                "2. When the potatoes are warm, then peel them and grate. I find it easier to grate the potatoes and then mash them.\n" +
                "\n" +
                "However, you can chop them first and mash with a potato masher. Let the grated or mashed potatoes cool completely.\n" +
                "\n" +
                "3. After the mashed potatoes have cooled completely, add the following ingredients: red chilli powder or cayenne pepper, garam masala powder or curry powder, coriander powder, dry mango powder, black salt and regular salt as per taste.\n" +
                "\n" +
                "4. Next add bread crumbs and arrowroot flour.\n" +
                "\n" +
                "Instead of arrowroot flour, you can also add rice flour, corn flour (corn starch) or tapioca starch or roasted besan (roasted chickpea flour or roasted gram flour).\n" +
                "\n" +
                "5. Mix everything thoroughly.\n" +
                "\n" +
                "Stuffing And Shaping Aloo Tikki :\n" +
                "1. Divide the mixture into small or medium shaped patties with a hollow center or cup shaped discs.\n" +
                "\n" +
                "Choose to apply some oil on your palms as it is easier to shape and stuff them.\n" +
                "2. Place the green peas filling in the center.\n" +
                "\n" +
                "3. Bring the mashed potato edges on the top and seal them.\n" +
                "\n" +
                "4. Roll gently between your palms and gently flatten. Make all aloo tikki this way.\n" +
                "\n" +
                "Frying Aloo Tikki:\n" +
                "1. Heat 2 tablespoons oil till on a skillet or tawa or frying pan till it is medium hot. Gently place the tikki and begin to pan-fry them.\n" +
                "\n" +
                "2. When the base is crispy and golden, gently flip each tikki with a spatula.\n" +
                "\n" +
                "3. Fry the second side till crispy and golden. You can gently flip once or twice more till the aloo tikki are golden and crisp evenly.\n" +
                "\n" +
                "4. Remove and place in a strainer kept on top of a bowl. You can even drain them on paper towels. In batches fry all of the potato patties this way.\n" +
                "\n" +
                "Add 2 tablespoons more oil when frying the second batch.\n" +
                "\n" +
                "5. Serve Aloo Tikki plain with coriander chutney and tamarind chutney. You can also serve these potato patties with sweet yogurt raita or tomato ketchup.\n" +
                "\n" +
                "Notes:\n" +
                "1. Potatoes: Try to use starchy potatoes like russet potatoes. Do not use new potatoes.\n" +
                "\n" +
                "2. If making aloo tikki for fasting – Add arrowroot flour or buckwheat flour or water chestnut flour or sago flour. Use edible rock salt, instead of regular salt.\n" +
                "\n" +
                "3. Spices & Herbs: You can reduce or increase the ground spices and herbs. A variation is to add fresh mint leaves to the patties. You can even add chaat masala. \n" +
                "\n" +
                "4. Crispiness: You can twice fry the tikki. First fry till pale golden. Then again fry till crispy and golden. \n" +
                "\n" +
                "5. Stuffing: The spiced green peas stuffing can be given a skip. You can also swap green peas with steamed sweet corn, grated paneer and cooked chana dal (split chickpeas). \n" +
                "\n" +
                "6. Binding Ingredients: Add the binding ingredients which you have in your pantry. So in place of arrowroot flour you can add cornstarch, rice flour, roasted besan (roasted chickpea flour), tapioca starch, potato starch or soaked bread slices. But do not skip on breadcrumbs as they help in making a nice crispy crust on the aloo tikki. \n" +
                "\n" +
                "7. Servings: Recipe makes 6 large tikki. You can make then medium sized or large. Choose to halve or double the recipe easily.\n"
                ,"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Indian/aloo_tikki.jpeg");
        foodsTable("Rajma Chawal ", "Servings: 4 | Cook Time: 9 hrs 45 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "I CUP = 240 ML\n" +
                "\n" +
                "- 0.8 cup rajma – 200 grams (dried kidney beans), any variety\n" +
                "- 2.8 to 3.2 cups water for pressure cooking\n" +
                "- enough water for soaking rajma\n" +
                "\n" +
                "For Ginger-Garlic-Chilli Paste\n" +
                "- 2.4 to 3.2 garlic cloves – medium-sized\n" +
                "- 0.8 inch ginger\n" +
                "- 0.8 to 1.6 green chillies or 1 to 2 Serrano peppers\n" +
                "\n" +
                "Other Ingredients\n" +
                "- 1.6 tablespoons Butter + 1 tablespoon oil or 3 tablespoons butter\n" +
                "- 0.4 teaspoon cumin seeds\n" +
                "- 0.6 to 0.8 cup finely chopped onions or 150 grams onions or 1 large onion\n" +
                "- 0.8 cup finely chopped tomatoes or 250 grams tomatoes or 3 medium or 2 large tomatoes\n" +
                "- 0.8 teaspoon Coriander Powder (ground coriander)\n" +
                "- 0.2 to 0.4 teaspoon red chili powder or cayenne pepper or hot paprika\n" +
                "- 0.2 teaspoon turmeric powder (ground turmeric)\n" +
                "- 0.8 pinch asafoetida (hing) – optional\n" +
                "- 0.2 to 0.4 teaspoon Garam Masala\n" +
                "- 1.2 to 1.6 cups rajma stock (the water which was used to cook the beans) or fresh water\n" +
                "- salt as required\n" +
                "- 0.8 teaspoon crushed kasuri methi (dried fenugreek leaves) – optional\n" +
                "- 1.6 to 2.4 tablespoons low fat cream or half and half or 1 tablespoon heavy whipping cream – optional\n" +
                "- 0.8 to 1.6 tablespoons chopped coriander leaves – for garnish, optional\n" +
                "\n" +
                "\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "Soaking\n" +
                "1. Rinse and soak the rajma (kidney beans) in enough water overnight or for 8 to 9 hours.\n" +
                "\n" +
                "2. Next day, discard the water and rinse the beans again in fresh water for a couple of times.\n" +
                "\n" +
                "3. Drain all the water.\n" +
                "\n" +
                "Pressure Cooking :\n" +
                "1. In a 3 litre pressure cooker, take both the soaked rajma and water.\n" +
                "\n" +
                "2. Pressure cook on a medium to high flame for 15 to 20 minutes.\n" +
                "\n" +
                "3. When the rajma is cooking, you can chop the onions, tomatoes etc.\n" +
                "\n" +
                "4. Crush the ginger, garlic and green chillies in a mortar-pestle to a fine or semi-fine texture. Set aside\n" +
                "\n" +
                "5. When the pressure settles down on its own, open the lid.\n" +
                "\n" +
                "6. Check if the rajma beans are cooked or not by taking a bite or pressing a few beans.\n" +
                "\n" +
                "7. If the beans are cooked well set aside or drain the beans.\n" +
                "\n" +
                "8. If the rajma are not cooked completely, then pressure cook again adding some water if required for some minutes.\n" +
                "\n" +
                "Making Masala : \n" +
                "1. Heat oil + butter in another pot or pan on a low heat. Add cumin first and let them crackle & get browned.\n" +
                "\n" +
                "2. Then add onions and sauté them till they caramelized or golden browned on a medium-low to medium heat.\n" +
                "\n" +
                "3. Take care not to burn them as this will give bitter tones in the curry.\n" +
                "\n" +
                "4. Light browning the onions is also alright.\n" +
                "\n" +
                "5. Keep on stirring the onions while sauteing them, for uniform cooking and also so that they don't get burnt.\n" +
                "\n" +
                "6. Lower the heat and add the crushed ginger-garlic-chili paste. Stir and sauté for 5 to 10 seconds on a low flame until the raw aroma of the ginger and garlic goes away.\n" +
                "\n" +
                "7. Add the tomatoes. Sauté for 2 to 3 minutes on medium-low to medium heat until the tomatoes become soft.\n" +
                "\n" +
                "8. Add all the spice powders one by one – turmeric powder, red chili powder, coriander powder, asafoetida (hing) and garam masala powder.\n" +
                "\n" +
                "9. On a medium-low heat or medium heat stirring often sauté the whole masala mixture until the fat starts leaving the sides of the masala base. This masala paste will become glossy, thicken and leave the sides of the pan.\n" +
                "\n" +
                "10. Using a slotted spoon or a strainer remove the beans and add them to the masala.\n" +
                "\n" +
                "11. Stir and sauté for a minute.\n" +
                "\n" +
                "Making Rajma Masala :\n" +
                "1. Add 2 cups of water. If you prefer you can also add the cooked rajma stock instead of fresh water.\n" +
                "\n" +
                "2. Add salt as required and stir the whole curry mixture.\n" +
                "\n" +
                "3. On a low heat to medium-low heat simmer without a lid for 10 to 12 minutes or more time until the curry thickens slightly. It should not be watery.\n" +
                "\n" +
                "4. Mash a few rajma beans with the spoon. This helps to thicken the curry.\n" +
                "\n" +
                "5. When the rajma masala has thickened and comes to the right consistency which is neither too thick nor thin, then add the crushed dried fenugreek leaves (kasuri methi) and cream. You can skip the cream if you prefer.\n" +
                "\n" +
                "6. Stir and simmer for 30 seconds to 1 minute. Switch off the heat.\n" +
                "\n" +
                "7. Serve rajma masala with steamed basmati rice, jeera rice or naan or roti or paratha. You can garnish with some coriander leaves when serving.\n" +
                "\n" +
                "8. The rajma chawal combo makes for a filling, heathy and a comforting meal.\n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Indian/rajma-recipe.jpg");
        foodsTable("Malai Kofta ", "Servings: 4 | Cook Time: 1 hrs 30 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "For Kofta:\n" +
                "- 100 grams Paneer or 1 cup grated paneer (Indian cottage cheese)\n" +
                "- 2 potatoes – medium to large – 200 grams, boiled, peeled and grated\n" +
                "- ¼ teaspoon red chili powder\n" +
                "- 2 tablespoons cornflour (cornstarch) or tapioca starch\n" +
                "- ¼ teaspoon Garam Masala\n" +
                "- 3 tablespoons almond flour or 2 tablespoons milk powder or 3 tablespoons khoya (mawa or dried evaporated milk solids)\n" +
                "- salt as required\n" +
                "- oil for deep frying, as required, any high smoke point neutral oil\n" +
                "\n" +
                "For Stuffing Kofta – Optional :\n" +
                "- 10 to 12 cashews\n" +
                "- 1 tablespoon raisins\n" +
                "\n" +
                "For Gravy :\n" +
                "- 3 tablespoons oil – any neutral oil\n" +
                "- ½ cup onion paste or about 2 medium to large onions or 1 heaped cup chopped onions\n" +
                "- 2 teaspoons Ginger Garlic Paste or 1 inch ginger, 4 to 5 garlic cloves crushed in a mortar\n" +
                "- 1 cup Tomato Puree or about 2 medium to large tomatoes\n" +
                "- ¼ teaspoon turmeric powder\n" +
                "- ¼ teaspoon fennel powder – optional\n" +
                "- ¼ teaspoon cumin powder\n" +
                "- 1 teaspoon kashmiri red chili powder or ½ tsp cayenne or red chilli powder\n" +
                "- 1 teaspoon Coriander Powder\n" +
                "- ¼ teaspoon Garam Masala\n" +
                "- 6 to 7 tablespoons cashew paste – 12 to 15 cashews soaked in warm water for 30 minutes and blended to a smooth paste with 2 to 3 tbsp water\n" +
                "- ½ to 1 teaspoon sugar or as required\n" +
                "- salt as required\n" +
                "- 2 cups water or add as required\n" +
                "- 1 teaspoon dry fenugreek leaves (kasuri methi)\n" +
                "- 2 tablespoons light cream or cooking cream or 1 tablespoon heavy or whipping cream – optional \n" +
                "\n" +
                "Whole Spices :\n" +
                "- 1 tej patta (Indian bay leaf)\n" +
                "- 1 inch cinnamon\n" +
                "- 1 black cardamom – optional\n" +
                "- 2 green cardamoms\n" +
                "- 2 single strands of mace or a light pinch of ground mace powder\n" +
                "- 2 cloves\n" +
                "\n" +
                "For Garnish :\n" +
                "- 1 to 2 tablespoons grated paneer (cottage cheese) – optional\n" +
                "- 1 or 2 tablespoons light cream or whipping cream – optional\n" +
                "- 2 tablespoons chopped coriander leaves (cilantro) or some mint leaves sprigs\n" +
                "\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "Making Paneer Kofta:\n" +
                "1. Mix all the ingredients mentioned under “For making paneer kofta” ingredient list except oil in a bowl.\n" +
                "\n" +
                "2. Rinse with water if you prefer and finely chop 10 to 12 cashews and 1 tablespoon raisins. Set aside. This will be the sweet-tangy and crunchy stuffing for the kofta.\n" +
                "\n" +
                "3. Make medium sized balls from the kofta mixture. If it feels sticky, rub some oil on your palms before shaping the kofta.\n" +
                "\n" +
                "4. Flatten one kofta ball lightly with your palms on a chopping board or a rolling board. Place a small portion of the cashews and raisins stuffing on it.\n" +
                "\n" +
                "5. Gently bringing the edges together, shape into a neat ball. Rub some oil in your palms while shaping. Make sure that the stuffing remains in the center of the kofta.\n" +
                "\n" +
                "6. Fill and shape all the kofta in this manner.\n" +
                "\n" +
                "7. Cover with a lid and set aside at room temperature or refrigerate for 30 minutes.\n" +
                "\n" +
                "Making Kofta Gravy:\n" +
                "1. Heat oil in a thick bottomed or heavy pan or skillet.\n" +
                "\n" +
                "2. Add all the whole spices and fry for a few seconds or until the spices crackle and the oil becomes fragrant.\n" +
                "\n" +
                "3. First add the onion paste. Stirring often sauté the onion paste until it becomes golden. To quicken the cooking of onions, add a few pinches of salt when you begin to sauté the paste.\n" +
                "\n" +
                "4. When the onion paste has become golden, add the ginger-garlic paste and sauté for about ten seconds or until the raw aroma of the ginger and garlic goes away.\n" +
                "\n" +
                "5. Add the tomato puree and sauté for 6 to 7 minutes on a low to medium-low heat.\n" +
                "\n" +
                "6. Add turmeric powder, coriander powder, fennel powder, kashmiri red chili powder, garam masala powder.\n" +
                "\n" +
                "7. Mix well and sauté for 4 to 5 minutes stirring often.\n" +
                "\n" +
                "8. Add cashew paste. Mix well and sauté until the oil starts to leave the side of the masala paste.\n" +
                "\n" +
                "9. This sautéing takes about 9 to 10 minutes on low to medium-low heat. You will see that the paste becomes lumpy and gathers around itself. It will also become slightly glossy with some oil releasing at the sides.\n" +
                "\n" +
                "10. Then add sugar and salt as per taste.\n" +
                "\n" +
                "11. Add water. Mix thoroughly with a spoon or wired whisk.\n" +
                "\n" +
                "12. Simmer until the gravy begins to thicken. This takes about 8 to 10 minutes on a low to medium-low heat. The consistency of the gravy can be medium-thick to thick. When the gravy is cooked through, you will some oil specks on the top of the gravy.\n" +
                "\n" +
                "13. Lastly add the crushed dry fenugreek leaves (kasuri methi) and cream.\n" +
                "\n" +
                "14. Mix well and set the gravy aside. Check the taste and add more salt or sugar if needed.\n" +
                "\n" +
                "Frying Paneer Kofta :\n" +
                "1. Heat oil in a frying pan or a wok (kadai).\n" +
                "\n" +
                "2. Before shaping and frying the entire batch, check a small tiny piece of the paneer kofta in hot oil. If it does not break, then you can easily fry the remaining koftas.\n" +
                "\n" +
                "3. If it does break, then add 1 to 2 tablespoons of cornflour (cornstarch) as a binder. Mix the binder in well, then shape into koftas.\n" +
                "\n" +
                "4. The kofta should also come up swiftly yet gradually in the hot oil. This means the oil is hot enough for the kofta to be fried. If it browns too quickly, the oil is very hot and if the kofta remains at the bottom, the oil is warm.\n" +
                "\n" +
                "5. Carefully add the paneer kofta to the hot oil, being careful not to spatter the oil. The oil should be medium hot and have a temperature of 180 to 190 degrees Celsius (356 to 374 degrees Fahrenheit).\n" +
                "\n" +
                "6. When one side becomes golden, gently turn over with a slotted spoon and fry the second side. Fry turning over a couple of times until golden on both sides.\n" +
                "\n" +
                "7. Remove with a slotted spoon to a paper towel lined plate. Working in batches, fry all the paneer kofta this way and drain them on a paper napkin so that the extra oil is absorbed.\n" +
                "\n" +
                "Serving Malai Kofta:\n" +
                "1. If serving immediately, add the fried paneer kofta to the gravy in the pan.\n" +
                "\n" +
                "2. Or if you want to serve it in a better way, take some of the gravy in a serving bowl. Place the kofta neatly on the gravy. Drizzle some cream or top with grated paneer. Garnish with chopped coriander leaves or mint leaves and serve.\n" +
                "\n" +
                "3. If serving a few hours later, reheat the gravy until hot. If it looks very thick, add a bit of hot water. Warm the kofta in an oven at 120 degrees Celsius or 250 degrees Fahrenheit for some minutes. Place kofta on the gravy. Add the garnishes and serve.\n" +
                "\n" +
                "4. Note that these paneer kofta are really soft. So if you add them to the gravy and serve them later, they will break. You have to serve them immediately as soon as you add them to the gravy.\n" +
                "\n" +
                "5. Serve malai kofta hot or warm with roti, naan, steamed basmati rice or jeera rice.\n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Indian/malai-kofta.jpg");
        foodsTable("Hyderabadi Biryani", "Servings: 4 | Cook Time: 1 hrs 30 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "FRIED ONIONS :\n" +
                "- ¾ lb onions yellow, finely sliced\n" +
                "- 1½ cups peanut oil\n" +
                "\n" +
                "CHICKEN MARINATION :\n" +
                "- 1½ lb chicken with bone, cut and clean\n" +
                "- ⅔ cup yogurt plain\n" +
                "- 1½ tablespoon ginger garlic paste or grated ginger and garlic\n" +
                "- 1 teaspoon salt adjust per taste\n" +
                "- 1 teaspoon chili powder\n" +
                "- ½ teaspoon turmeric ground\n" +
                "- 1 chili pepper jalapeno, serrano or cayenne, adjust per taste\n" +
                "\n" +
                "SPICES (see note):\n" +
                "- 1 cinnamon stick\n" +
                "- 1 black cardamom\n" +
                "- 5 green cardamom\n" +
                "- 5 cloves\n" +
                "- 1 bay leaves large\n" +
                "- 1 teaspoon shah Jeera see note\n" +
                "- ½ teaspoon ground black pepper\n" +
                "\n" +
                "BIRYANI :\n" +
                "- 2 cups basmati rice long grain\n" +
                "- 1 teaspoon salt adjust per taste\n" +
                "- 2 tablespoon olive oil\n" +
                "- 2 tablespoon lemon juice\n" +
                "- ¼ cup cilantro fresh, chopped\n" +
                "- 2 tablespoon mint fresh, chopped\n" +
                "- 1 teaspoon saffron ground and dissolved in 2 tablespoon hot water\n" +
                "- 2 tablespoon ghee optional, recommended\n" +
                "\n" +
                "WHOLE SPICES FOR RICE :\n" +
                "- 1 black cardamom\n" +
                "- 3 green cardamom\n" +
                "- 4 cloves\n" +
                "- 2 bay leaves\n" +
                "- ½ cinnamon stick\n" +
                "US Customary - Metric\n" +
                "\n" +
                "Equipment :\n" +
                "- Rice Cooker\n" +
                "- Wide Frying Pan\n" +
                "- Candy/Fry thermometer\n" +
                "- Spice Grinder\n" +
                "- Oven Proof Cooking Pot\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "Fry Onions :\n" +
                "\n" +
                "1. Heat oil at medium high in a wide frying pan. If you place your palm about 3 inches over the surface of oil, you should feel the heat. Or use a candy/fry thermometer.\n" +
                "2. Fry onions in batches. Do not crowd the pan. Fry until crisp light golden brown. Set aside.\n" +
                "\n" +
                "Marinate Chicken :\n" +
                "1. In a large mixing bowl, combine chicken with all marinade ingredients and ⅓ of fried onions.\n" +
                "Tip: Add yogurt, starting with ½ cup and increase as needed to ¾ cup. The mixture should be thick and not runny.\n" +
                "\n" +
                "2. Grind biryani spices in a spice grinder. Add to chicken marinade and combine. Marinate for about 3 to 5 hours.\n" +
                "\n" +
                "Cook Rice :\n" +
                "1. Rinse rice 4 to 5 times in lots of water until it is clear. Drain well. Soak ⅓ cup basmati rice in water for one hour. Save the rest.\n" +
                "\n" +
                "2. Below is the rice cooker method. For alternative traditional cooking method check our lamb biryani recipe.\n" +
                "\n" +
                "3. Bring 2¼ cups of water to a rolling boil in a rice cooker. Add ¾ teaspoon salt, 1½ tablespoons olive oil and whole spices (see note). Then add remaining 1⅔ cups basmati rice and stir. Let it cook just until all the water is absorbed (see notes).\n" +
                "\n" +
                "4. It is important to NOT let the rice steam until it is fully done. Just when all the water is well absorbed, transfer cooked rice immediately to another wide open pan. In my rice cooker the whole process takes about 15 to 20 minutes.\n" +
                "\n" +
                "Assemble :\n" +
                "1. Transfer chicken with marinade to a 5-quart, wide, thick-bottomed and oven-proof cooking pot (9 to 10 inch diameter). Make sure there is not too much marinade around chicken pieces and that it is not runny.\n" +
                "\n" +
                "2. Scatter cilantro, mint, half the lemon juice and ½ tablespoon olive oil over the chicken and marinade. Then scatter most of the fried onions.\n" +
                "\n" +
                "3. Drain the soaked basmati rice very well and spread it over the fried onion layer. (This raw soaked rice will get cooked with the juices from chicken).\n" +
                "\n" +
                "4. Next, layer all the cooked rice. Top with remaining lemon juice, saffron water, fried onions and ghee.\n" +
                "Tip: If you prefer, you may pick out the whole spices from cooked rice before steaming.\n" +
                "\n" +
                "Steam :\n" +
                "1. Oven Method: Place one sheet of parchment paper, followed by one to two sheets of aluminum foil over the cooking pot. Place the lid tight over it. Bake biryani in a preheated oven at 350ºF for one hour, until steam builds up well.\n" +
                "\n" +
                "2. Stove-Top Method (Alternative): Heat the biryani at medium high for about 10 to 15 minutes and then reduce to low and cook for one hour until steam builds up well.\n" +
                "\n" +
                "Serve :\n" +
                "1. Remove from oven or stove. Let it cool five minutes and gently mix rice and chicken. Using a spatula, mound the biryani on a serving plate, making sure to present the rice in various colors - white, yellow, orange and brown. Place some chicken pieces on the top. Scatter fried onions, herbs and extra saffron rice on top. \n" +
                "\n" +
                "2. Serve it with mirchi ka salan or Hyderabadi tomato egg curry and raita.\n" +
                "\n" +
                "Notes :\n" +
                "1. Rinse basmati rice several times until the water is clear and not starchy. \n" +
                "\n" +
                "2. Rice cooker: Use minimal water to cook rice. Test 1¼ to 1½ cups water per cup of basmati rice and check.\n" +
                "\n" +
                "3. Aged basmati rice is more fragrant and will give the best results.\n" +
                "\n" +
                "4. Additional moisture: Keep in mind moisture from chicken, herbs and yogurt. Cooked rice should be fluffy, separate, retain shape, not too wet and delicate. Drain soaked rice very well. Chicken should be just lightly coated with marinade. Too much marinade can make rice soggy.\n" +
                "\n" +
                "5. Slice onions finely: I use 7.5 mm setting on my mandolin slicer.\n" +
                "\n" +
                "6. Adjust oil as needed: If frying directions are followed, then oil absorbed by onions should be about 1½ tablespoons. Otherwise, more oil will be absorbed, so adjust oil for recipe.\n" +
                "\n" +
                "7. Alternative to frying onions: If you are unable to fry onions then saute them until crisp golden brown like in this Persian noodle soup recipe and adjust oil used for rice and chicken.\n" +
                "\n" +
                "8. Branded biryani spice mixes may include salt and chili powder. If using that, then adjust salt and chili powder. \n" +
                "\n" +
                "9. Chicken: Best is whole chicken with bone, cut and clean. You may use chicken leg quarters or thighs, but avoid chicken breast as it will be too dry.\n" +
                "\n" +
                "10. Optimal amount of salt and oil is very important. If everything else is perfect and you don't use right amount of salt, that alone can ruin the taste of biryani. I use a minimum of 2 tablespoons of oil per cup of raw rice, as there are additional ingredients - chicken, onions, etc.\n" +
                "\n" +
                "11. Whole spices can also be cooked wrapped in a muslin cloth (like boquet garni) or in a metal mesh cooking infuser. If using whole spices for marinade, then double the amount of spices. Ground spices are more intense. \n" +
                "\n" +
                "12. Meal Prep: Combine chicken with marinade and fry onions a day before. \n" +
                "\n" +
                "13. Storage and Freezing: Leftovers can be stored in refrigerator for 3 to 4 days or frozen for later.\n" +
                "\n" +
                "14. Scale Recipe: Click on number of servings and slide. Adjust the cooking pot size.\n" +
                "\n" +
                "15. Shajeera: These are referred to as black cumin or black caraway seeds in Indian stores. The labeling is not consistent. Ask your Indian grocer for “shahjeera”.\n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Indian/biryani.png");
       foodsTable("Prawn Curry", "Servings: 6 | Cook Time: 55 mins\n" +
               "\n" +
               "INGREDIENTS :\n" +
               "\n" +
               "- 1 kilograms prawns\n" +
               "- 1 teaspoon turmeric\n" +
               "- salt as required\n" +
               "- 6 green chilli\n" +
               "- 1 bunch curry leaves\n" +
               "- 5 dry red chili\n" +
               "- 1 1/2 cup grated coconut\n" +
               "- 2 onion\n" +
               "- 4 medium tomato\n" +
               "- water as required\n" +
               "- 4 tablespoon coriander seeds\n" +
               "- 2 teaspoon cumin seeds\n" +
               "- 1/2 cup vegetable oil\n" +
               "- 2 teaspoon tamarind\n" +
               "--------------------------\n" +
               "\n" +
               "Instructions :\n" +
               "\n" +
               "Step 1 Prepare the masala :\n" +
               "To prepare this delicious prawns curry recipe, start by taking the grated coconut and grinding it up in a grinder. Then, add the red chilies, cumin seeds, coriander seeds into the grinder with a little water and grind it into a paste. In a large bowl, take onions and tomatoes and finely chop them up.\n" +
               "\n" +
               "Step 2 Saute onion & add masala paste :\n" +
               "Then, put a large pan over medium flame and heat vegetable oil in it for about 2 minutes. When the oil is hot enough, add the chopped onions in it and saute well until they are translucent. Then, add the paste along with turmeric powder and stir well.\n" +
               "\n" +
               "Step 3 Add tomatoes, tamarind pulp & water :\n" +
               "Next, add curry leaves, green chillies and salt to the pan along with the chopped tomatoes. Fry the ingredients for 8 to 10 minutes. Now, add tamarind pulp to the pan and 3 to 4 cups of water and bring it to a boil.\n" +
               "\n" +
               "Step 4 Add prawns to the curry until tender:\n" +
               "When the ingredients are done, turn down the flame to low and add the prawns. Close the lid to the pan and allow it to simmer till the prawns are tender, cook it for 5-10 minutes.\n" +
               "\n" +
               "Step 5 Serve Prawn Curry!:\n" +
               "When the prawns are done, transfer it to a serving bowl. Now, enjoy the delicious prawn curry with your favourite rice.\n" +
               "\n" +
               "Tips:\n" +
               "- You can add coconut cream or coconut milk as per your taste.\n" +
               "\n" +
               "- Garnish your prawns masala curry with freshly chopped coriander leaves.\n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Indian/easy-curried-prawns.jpg");
        foodsTable("Tandoori Fish","Servings: 4 | Cook Time: 35 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "I CUP = 240 ML\n" +
                "- 3/4 cup and 3 and 3/4 tablespoon salmon fish\n" +
                "\n" +
                "For Marination\n" +
                "- 5 and 1/4 cloves garlic\n" +
                "- 3/4 piece ginger\n" +
                "- 2/3 tablespoon lime zest\n" +
                "- 1/3 teaspoon cumin powder\n" +
                "- salt As required\n" +
                "- 2 tablespoon gram flour (besan)\n" +
                "- 1 and 1/4 handful coriander leaves\n" +
                "- 1 and 1/3 tablespoon lime juice\n" +
                "- 2/3 tablespoon red chilli powder\n" +
                "- 1/3 tablespoon garam masala powder\n" +
                "- 2/3 cup vegetable oil\n" +
                "- 1/3 cup and 1 tablespoon hung curd\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "Step 1 Prepare a special ginger-garlic paste :\n" +
                "To begin with wash and clean the fish. Next, make a fine paste with half of the vegetable oil, garlic, coriander, ginger, red chilli powder, cumin powder, garam masala, lime juice and zest, and salt.\n" +
                "\n" +
                "Step 2 Make gram flour paste :\n" +
                "Heat the oil in a pan and add the gram flour, stir to make a paste, and cook for about a minute till fragrant and lightly coloured.\n" +
                "\n" +
                "Step 3 Add spice paste, yoghurt & marination ingredients :\n" +
                "Add the mixture to the spice paste and combine with the yoghurt. Mix well all the ingredients for the marinade.\n" +
                "\n" +
                "Step 4 Marinate the fish cubes & preheat the oven :\n" +
                "Gently rub the marinade over the fish pieces and marinate for an hour. Preheat the oven to 200 degree Celsius and spread out the marinated fish in a baking dish.\n" +
                "\n" +
                "Step 5 Bake for 10-15 minutes :\n" +
                "Bake the tandoori fish for 10-15 minutes on the top rack turning the fish pieces once. Baste the fish pieces once or twice during cooking with butter. Serve hot with chutney or sauce.\n" +
                "\n" +
                "Tips :\n" +
                "- Squeeze lemon juice over your fish tikkas for best taste.\n" +
                "- Let the fish marinate for 2-3 hours or even overnight if you have the time.\n" +
                "- You can use any other fish that you prefer for this recipe.\n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Indian/Fish_Tandoori.jpg");
        CatList("Indian", R.drawable.indian);

        //----------------------------------------------------

        foodsTable(" Mutton Nihari", "Servings: 6 | Cook Time: 3 hrs 15 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- 1 kg Lamb\n" +
                "- 1 Onions\n" +
                "- 100 ml Oil\n" +
                "- 1 tsp Ginger Paste\n" +
                "- 1 tsp Garlic Paste\n" +
                "- 1 tsp Chilli Powder\n" +
                "- 1 tsp Turmeric Powder\n" +
                "- 1 tsp Salt\n" +
                "- 50 g Wheat Flour\n" +
                "- 100 ml Water\n" +
                "- Coriander\n" +
                "- Ginger\n" +
                "- 2 Green Chillies\n" +
                "\n" +
                "Nihari Masala :\n" +
                "- 1 tbsp Fennel Seeds Saunf\n" +
                "- 1 tbsp Cumin Seeds Jeera\n" +
                "- 1 tbsp Coriander Seeds\n" +
                "- 1 tbsp Peppercorn\n" +
                "- 1- inch Cinnamon Dalchini\n" +
                "- 2 Black Cardamom Bari Elaichi\n" +
                "- 5 Green Cardamoms Elaichi\n" +
                "- 7 Cloves\n" +
                "- 2 Bay Leaf\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "1. In a pan heat up the oil on medium heat until hot\n" +
                "\n" +
                "2. Add the ginger paste and garlic paste then sauté for a few minutes on medium heat\n" +
                "\n" +
                "3. Add the lamb or mutton and cook until the colour changes\n" +
                "\n" +
                "4. While the lamb/mutton is cooking, grind the fennel seeds, cumin seeds, coriander seeds, black peppercorns, cinnamon, black cardamom pods, green cardamom pods, cloves and bay leaves until a fine powder is formed\n" +
                "\n" +
                "5. Add the nihari masala powder, chilli powder, turmeric powder, and salt then cook the spices for 5 minutes\n" +
                "\n" +
                "6. Add the water and cook for a further 2 hours on low heat until the meat is tender\n" +
                "\n" +
                "7. In a separate bowl, mix the wheat flour and 100ml of water to form a smooth paste – this flour mixture acts as a thickening agent, if you want to thicken it more then add more flour\n" +
                "\n" +
                "8. Add the flour mixture into the pan then cover with a lid and cook for 30 minutes on a low heat\n" +
                "\n" +
                "9. In another pan, heat up the olive oil on medium heat until hot\n" +
                "\n" +
                "10. Add the sliced onions and fry the sliced onions until browned and caramelised\n" +
                "\n" +
                "11. Add the browned onions to the lamb along with the chopped coriander, julienned ginger, and finely diced chillies\n" +
                "\n" +
                "12. Serve with homemade naan and enjoy!","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Pakistani/Nihari.jpeg");

        foodsTable("Seekh Kebab", "Servings: 10 | Cook Time:  1 hr 20 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- 2 tsp coriander seeds\n" +
                "- 2 tsp cumin seeds\n" +
                "- 1/2 small to medium (~75-85 g) yellow onion, roughly chopped\n" +
                "- 4 small (5 g) green chili peppers such as Thai Chili, sliced\n" +
                "- 1/4 cup (~8 g) cilantro leaves\n" +
                "- 2 tbsp (~2 g) mint leaves\n" +
                "- 1 lb (454 g) ground beef (20% fat – not lean), or sub ground meat of choice\n" +
                "- 1 1/2 tsp kosher salt\n" +
                "- 1 tbsp (5-6 garlic cloves) crushed garlic\n" +
                "- 3/4 tbsp crushed ginger\n" +
                "- 1 tsp freshly ground black pepper\n" +
                "- 1/2 tsp red chili flakes\n" +
                "- 1 tsp garam masala, See Note 1\n" +
                "- 1 tsp papaya paste, optional – for extra tender kebabs\n" +
                "- neutral oil (for searing), as needed\n" +
                "\n" +
                "For Serving\n" +
                "- Cilantro Mint Raita\n" +
                "EQUIPMENT\n" +
                "- Kebab Skewers, chopsticks, straws, or other makeshift skewer\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "1. Heat a small skillet over medium heat. Add the cumin seeds and coriander seeds. Toast, stirring and shaking the skillet often,for 2-3 minutes. The seeds will deepen in color and become highly aromatic. Remove from heat, allow to cool slightly, and grind to a powder in a spice grinder or mortar and pestle.\n" +
                "\n" +
                "2. Strain and pat out any excess moisture from the ground beef and place into a large bowl or bowl of a stand mixer. The kebab mixture should be as dry as possible to prevent any breaking.\n" +
                "\n" +
                "3. Add the onion, cilantro, mint, and green chili peppers to a food processor. Using the pulse function, finely chop (but not blend) them to a coarse mixture (~17 pulses). You may need to pause and scrape down the sides in between. Remove the onion mixture, squeeze out the excess moisture between your hands, and add to the beef.\n" +
                "\n" +
                "4. Add the salt, garlic, ginger, black pepper, red chili flakes, garam masala, toasted & ground cumin & coriander, and papaya paste (if using). Mix well.\n" +
                "\n" +
                "5. Using gloved hands (do not use bare hands or the green chili may sting), knead for 3-4 minutes, until you begin to see a lacy, stringy texture (resha) of the meat. (Alternatively, you can use the paddle attachment of a food processor and knead on medium speed for 2 minutes.) The mixture should be homogenous instead of crumbly.\n" +
                "\n" +
                "6. Cover the bowl and set aside for 30 minutes, or refrigerate up to overnight.\n" +
                "\n" +
                "7. To test a piece for taste, heat a small pan over medium-high heat. Add a small amount of neutral oil and place a piece of the beef mixture on the pan to cook, turning over as needed. Taste and adjust salt and seasoning if desired.\n" +
                "\n" +
                "8. Using oiled hands, take around 1/4 cup of themeat and form into a hearty round shape. Run the kebab skewers through the meat and use your hands to form a sausage-like shape around the skewer. It should come to 5-6 inches long. (See Note on how to freeze.)\n" +
                "\n" +
                "For Pan-Frying:\n" +
                "1. Heat a large, nonstick or cast iron skillet over medium or medium-high heat. Add enough oil to coat the bottom of the pan. When the oil is hot, place the kebabs on the pan, making sure not to crowd them. Use tongs to turn the kebabs frequently, making sure all sides are browned evenly. Cook for 6-7 minutes in total. If you have a meat thermometer, it should read at least 160 °F. Transfer the kebabs to a large plate lined with a paper towel.\n" +
                "\n" +
                "For Air-Frying:\n" +
                "1. Place the kebabs in a single layer leaving room on both sides. Cook at 400 °F for 4-5 min. Then turn and cook for another 3-4 minutes, until browned and cooked through.\n" +
                "\n" +
                "For Baking:\n" +
                "1. Preheat the oven to 430°F/220°C. Place one rack in the middle of the oven, and the other rack at top so that your sheet pan can be as close as possible to the heat source/broiler. Place the kebabs on a baking sheet lined with aluminum foil. Brush with oil or butter, if desired. Bake in the middle rack for 8-10 minutes, turning them over midway. Transfer the pan to the top rack.\n" +
                "\n" +
                "2. Turn your broiler on High (550°F/287°C). Broil for 2 minutes. Then turn and broil for another 1-2 minutes. (See Note 2)\n" +
                "\n" +
                "To Serve\n" +
                "1. Serve immediately with cilantro mint raita/chutney, crunchy vegetables, and lemon wedges.\n" +
                "\n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Pakistani/Seekh-Kebab.jpg");

        foodsTable("Haleem", "Servings: 4 | Cook Time:  1 hr 25 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- 1/2 tsp lamb (boneless) \n" +
                "- 150 gms moong dal (washed)\n" +
                "- 50 gms dal chana100 gms wheat (broken)\n" +
                "- 500 ml desi ghee\n" +
                "- 10 Cloves\n" +
                "- 4 Bay leaves\n" +
                "- 1 gms saffron3\n" +
                "- 0 gms green chilly paste\n" +
                "- 10 gms turmeric powder\n" +
                "- 6 gms mace\n" +
                "- 10 gms green cardamom\n" +
                "- 50 gms garlic paste\n" +
                "- 50 gms ginger, grated\n" +
                "- 150 gms onion, fried\n" +
                "- 3-4 litre lamb stock\n" +
                "- to taste salt\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "1.Wash and soak all the lentils and broken wheat together for 2 hours.\n" +
                "\n" +
                "2.Take a heavy bottom handi and add ghee to temper it with whole spices - cloves, bay leaf and green cardamom. When the spices start crackling, add the grated ginger and garlic paste till the colour turns brown.\n" +
                "\n" +
                "3.Add the lamb along with all the powdered spices saffron, green chilli paste, turmeric powder and cook until it is half done and then add fried onions.\n" +
                "\n" +
                "4.Drain the water from the lentils and add it to the lamb along with lamb stock. Add salt at this stage.\n" +
                "\n" +
                "5.Let it cook until lamb gets tender and mixes with the lentils and becomes thick in consistency.\n" +
                "\n" +
                "6.Check for the seasoning and serve with the choice of breads\n" +
                "\n" +
                "Recipe Notes :\n" +
                "- You can pair Haleem with breads like Baqarkhani or you can have it alone as it is a whole meal in itself.\n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Pakistani/Haleem.jpg");
        foodsTable("Karahi Chicken", "\n" +
                "Servings: 3 | Cook Time: 35 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- 1/2 cup oil or ghee\n" +
                "- 550g chicken, bone in and cut into curry pieces\n" +
                "- 600g tomatoes, finely chopped\n" +
                "- 1 bulb garlic, minced\n" +
                "- 2 tbsp ginger, minced\n" +
                "- 1-2 tsp salt, or to taste\n" +
                "- 2 tsp paprika/kashmiri red chilli\n" +
                "- 1.5 tsp crushed black pepper\n" +
                "- 1 tsp chilli flakes\n" +
                "- 0.5 tsp cumin powder\n" +
                "- 0.5 tsp coriander powder\n" +
                "- 1tsp kalonji (black seed, optional)\n" +
                "- 2 green chillis, slit in half lengthwise\n" +
                "- 0.5 bunch coriander, chopped\n" +
                "- 1/4 cup ginger cut into matchstick pieces\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "1. Heat up your oil in a karahi dish, wok, cast iron skillet or any pan suitable for stirfrying, keeping the flame on high for the entire duration\n" +
                "\n" +
                "2. Add the chicken in. Fry this, stirring constantly until the chicken begins to take on a golden colour in some places\n" +
                "\n" +
                "3. Add in the minced ginger and garlic. Give this a fry alongside the chicken, again stirring constantly and ensuring nothing burns. Continue to fry this until the raw smell of the ginger and garlic begins to fade\n" +
                "\n" +
                "4. Add all the chopped tomatoes and spices. Stir in and allow this all to cook on high, stirring to ensure nothing catches at the bottom of the pan\n" +
                "\n" +
                "5. Continue to cook this mix for about 20 minutes. The oil will separate, the tomatoes will thicken and begin to coat the chicken, and you will see holes begin to bubble in the gravy. The chicken should be cooked through at this point\n" +
                "\n" +
                "6. Add the coriander and green chillis, stir in, turn the heat down to a low flame and allow everything to simmer together for 5 minutes without putting the lid on\n" +
                "\n" +
                "7.Serve with the matchstick-cut ginger and additional coriander/green chilli if desired\n" +
                "\n" +
                "NOTES :\n" +
                "\n" +
                "- If your chicken hasn't cooked through, you can put the lid on and simmer everything on low for a few additional minutes. Avoid adding water unless absolutely necessary.\n" +
                "\n" +
                "- If you don't intend to serve this immediate, stop after step 5. Proceed with step 6 when you are almost about to serve.\n" +
                "\n" +
                "- 1/2-1 tsp garam masala powder can also be added alongside the coriander optionally. I'd recommend making the garam masala fresh at home for optimal flavour and fragrance.\n" +
                "\n" +
                "- If for some reason you have to or want to use onions, I would recommend you add 1 large onion very finely chopped into the oil before the chicken and allow this to cook until lightly golden before adding the chicken.\n" +
                "\n" +
                "- I use Himalayan pink salt at home. It is milder than sea salt. Please add salt and adjust according to your own preference.\n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Pakistani/Karahi_Chiken.jpg");
        foodsTable("Aloo Keema", "Servings: 8 | Cook Time: 1 hr 20 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- 2 tablespoons extra-virgin olive oil\n" +
                "- 1 extra-large onion, chopped\n" +
                "- 2 tablespoons water (Optional)\n" +
                "- 2 pounds lean ground beef\n" +
                "- 4 cloves garlic, minced\n" +
                "- 2 tablespoons grated fresh ginger root\n" +
                "- 1 serrano chile pepper, finely chopped\n" +
                "- 2 teaspoons chopped fresh cilantro\n" +
                "- 1 tablespoon ground coriander\n" +
                "- 1 ½ teaspoons salt\n" +
                "- 1 ½ teaspoons ground cumin\n" +
                "- 1 teaspoon ground cayenne pepper\n" +
                "- 1 teaspoon ground turmeric\n" +
                "- 3 potatoes, peeled and diced\n" +
                "- 1 (28 ounce) can diced tomatoes\n" +
                "- 1 cup frozen green peas\n" +
                "- 1 teaspoon garam masala\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "STEP - 01:\n" +
                "Heat olive oil in a large saucepan over medium-high heat. Add onion; cook and stir until soft and beginning to brown, about 12 minutes. If browned bits of onion are stuck to the bottom of the pan, add water and stir to loosen.\n" +
                "\n" +
                "STEP - 02:\n" +
                "Stir ground beef, garlic, ginger, serrano chile, and cilantro into the pan; cook and stir until beef is browned and crumbly, 10 to 15 minutes. Reduce heat to medium-low. Stir in coriander, salt, cumin, cayenne pepper, and turmeric; cook and stir until flavors blend, about 5 minutes. Add potatoes and tomatoes; cover and simmer until potatoes are tender, about 15 minutes.\n" +
                "\n" +
                "STEP - 03:\n" +
                "Stir in green peas and cook until sauce has slightly thickened and flavors have blended, 10 to 15 minutes. Sprinkle garam masala over top, cover, and let stand for 5 minutes before serving.\n" +
                "\n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Pakistani/aloo_kema.jpg");
       foodsTable("Chapli Kebab", "Servings: 4 | Cook Time: 40 mins\n" +
               "\n" +
               "INGREDIENTS :\n" +
               "\n" +
               "- cooking spray\n" +
               "- 1 large egg, lightly beaten\n" +
               "- 1 pound ground beef\n" +
               "- 1 red onion, finely chopped\n" +
               "- 1 tomato, finely chopped\n" +
               "- ¼ cup finely chopped cilantro\n" +
               "- ¼ cup finely chopped mint\n" +
               "- 2 teaspoons ginger-garlic paste\n" +
               "- 2 teaspoons coriander seeds, crushed\n" +
               "- 1 teaspoon salt\n" +
               "- ¾ teaspoon ground cumin\n" +
               "- ¾ teaspoon ground cayenne pepper\n" +
               "- 2 tomato, sliced into rounds\n" +
               "- ¼ cup vegetable oil for frying, or more as needed\n" +
               "\n" +
               "--------------------------\n" +
               "\n" +
               "Instructions :\n" +
               "\n" +
               "STEP - 01:\n" +
               "Coat a small skillet with cooking spray and place over medium-high heat. Cook and stir beaten egg in the hot skillet until scrambled and set, 3 to 5 minutes.\n" +
               "\n" +
               "STEP - 02:\n" +
               "Combine scrambled egg, beef, onion, chopped tomato, cilantro, mint, ginger-garlic paste, coriander seeds, salt, cumin, and cayenne pepper in a large bowl; mix by hand until well combined. Shape mixture into patties. Press a tomato slice into the center of each patty.\n" +
               "\n" +
               "STEP - 03:\n" +
               "Heat oil in a deep skillet to 375 degrees F (190 degrees C). Cook patties in hot oil in batches until charred, 4 to 6 minutes per side.\n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Pakistani/chapli_Kebab.jpg");
        foodsTable("Papdi Chaat", "Servings: 4 | Cook Time: 9 hrs 2 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "For Cooking Chickpeas, Potatoes :\n" +
                "- 1 cup dried chickpeas – swap with 2.5 to 3 cups cooked or canned chickpeas\n" +
                "- 2 cups water – for pressure cooking chickpeas\n" +
                "- ½ teaspoon salt\n" +
                "- 1 potato – medium to large\n" +
                "\n" +
                "For Papdi Chaat :\n" +
                "- 24 to 30 papdi crispy puri or flour crackers\n" +
                "- 1 cup curd (yogurt) – whisked till smooth, cold and fresh\n" +
                "- 1 onion small to medium, finely chopped – optional\n" +
                "- 1 tomato small to medium, finely chopped – optional\n" +
                "- ¼ cup chopped coriander leaves\n" +
                "- ½ cup Mint-Coriander Chutney – recipe ingredients and method below\n" +
                "- ½ cup tamarind dates chutney – recipe ingredients and method below\n" +
                "- ¼ cup chilli garlic chutney – recipe ingredients and method below, optional\n" +
                "- 1 teaspoon kashmiri red chili powder – optional\n" +
                "- 1 teaspoon roasted cumin powder\n" +
                "- 1 to 2 teaspoons chaat masala\n" +
                "- 1 teaspoon black salt or edible rock salt or regular salt, add as required\n" +
                "- ¼ to ⅓ cup pomegranate arils – optional\n" +
                "- 1 to 2 teaspoons lemon juice or lime juice, optional\n" +
                "- ½ cup sev – optional\n" +
                "\n" +
                "For Green Mint Coriander Chutney :\n" +
                "- 1 cup chopped mint leaves\n" +
                "- ½ cup chopped coriander leaves\n" +
                "- 1 green chili chopped or add as required\n" +
                "- 1 to 2 teaspoon lemon juice or lime juice – preserves the green color of the chutney\n" +
                "- salt as required\n" +
                "\n" +
                "For Sweet Tamarind Dates Chutney :\n" +
                "- ½ cup tamarind\n" +
                "- ½ cup seedless dates\n" +
                "- ½ cup jaggery\n" +
                "- ½ teaspoon dry ginger powder (ground ginger)\n" +
                "- 1 teaspoon Coriander Powder\n" +
                "- 1 teaspoon roasted cumin powder\n" +
                "- ½ teaspoon red chili powder – optional\n" +
                "- 2 cups water or add as required\n" +
                "- salt or black salt, add as required\n" +
                "\n" +
                "For Spicy Chilli Garlic Chutney :\n" +
                "- 18 to 20 garlic cloves – medium to large sized\n" +
                "- 2 teaspoons kashmiri red chilli powder\n" +
                "- ¼ teaspoon salt or add as required\n" +
                "- 2 to 3 tablespoons water or add as required, for blending or grinding\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "Cooking The Chickpeas:\n" +
                "1. If you wanna add chickpeas to the papdi chaat, then some effort is needed. This is if you don’t want to use canned chickpeas.\n" +
                "\n" +
                "2. Rinse chickpeas in water a couple of times. Soak them in 3 cups water overnight or for 8 to 9 hours.\n" +
                "\n" +
                "3. Later drain the soaked water and rinse the chickpeas again a few time. Add the chickpeas to a 2 litre pressure cooker together with water and salt.\n" +
                "\n" +
                "4. If you want to cook potato, then keep a potato in steel bowl. Place this steel bowl with the potato in it on the chickpeas and water mixture in the cooker. The potato and chickpeas will be cooked together.\n" +
                "\n" +
                "5. Cover the cooker tightly with the lid and pressure cook on medium heat until the pressure starts building and you hear the hissing sound in the cooker. Then lower the heat a bit and pressure cook for 10 to 12 whistles.\n" +
                "\n" +
                "6. When the pressure settles on its own in the cooker then only remove the lid.\n" +
                "\n" +
                "7. Check the potato by piercing it with a knife or fork. It should be tender, soft and the knife or fork should easily pass through it. Lift the potato with a pasta tong and set it aside to cool at room temperature.\n" +
                "\n" +
                "8. Check to see if the chickpeas are cooked. They should have a soft melt-in-the-mouth texture. Drain the water and set the cooked chickpeas aside.\n" +
                "\n" +
                "Making The Green Mint Coriander Chutney :\n" +
                "1. Blend all the ingredients with very little water to a smooth and fine consistency.\n" +
                "\n" +
                "2. Set aside or refrigerate in a small covered container or jar.\n" +
                "\n" +
                "Making The Sweet Tamarind Dates Chutney :\n" +
                "1. Boil the tamarind and dates in water.\n" +
                "\n" +
                "2. When they become soft add the jaggery and the spice powders and salt.\n" +
                "\n" +
                "3. Cook further till the jaggery melts.\n" +
                "\n" +
                "4. Switch off the heat and let the mixture cool.\n" +
                "\n" +
                "5. Grind the chutney mixture to a fine and smooth paste. Seive the chutney through a strainer if needed. Add more salt if required.\n" +
                "\n" +
                "6. If the chutney becomes too thick add some water to liquidize it.\n" +
                "\n" +
                "Making Spicy Chili Garlic Chutney :\n" +
                "1. Peel the garlic cloves and rinse them in water. Add them together with the kashmiri red chilli powder, salt and water to a small blender or chutney grinder jar or a spice grinder.\n" +
                "\n" +
                "2. Blend to a smooth and fine consistency without any tiny chunks or bits.\n" +
                "\n" +
                "3. Transfer the red chutney in a small bowl and set aside.\n" +
                "\n" +
                "For Assembling Papdi Chaat:\n" +
                "1. Arrange 6 to 8 papdi in a shallow bowl or plate.\n" +
                "\n" +
                "2. Top it up with some of the chopped boiled potato cubes and cooked chickpeas.\n" +
                "\n" +
                "3. You can add chopped onions and tomatoes at this point, but it is optional.\n" +
                "\n" +
                "4. Sprinkle some chaat masala, roasted cumin powder and optionally kashmiri red chili powder on it, if you want at this step.\n" +
                "\n" +
                "5. Top these with whisked cold curd (yogurt) as you like.\n" +
                "\n" +
                "6. Top it up evenly with 1 to 2 tablespoons of the green chutney as much as you want.\n" +
                "\n" +
                "7. Then add 2 to 3 tablespoons of the sweet tamarind chutney and 1 to 2 teaspoons of the spicy chilli garlic chutney evenly. According to your taste preferences you can add less or more of each chutney.\n" +
                "\n" +
                "8. Sprinkle some chaat masala, red chili powder, cumin powder and black salt or regular salt.\n" +
                "\n" +
                "9. Garnish with coriander leaves and pomegranate arils. Sprinkle sev on top and this step is also optional.\n" +
                "\n" +
                "10. Add a dash of lemon juice to the papri chaat if you prefer.\n" +
                "\n" +
                "11. Serve papdi chaat immediately.","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Pakistani/papdi-chaat.jpg");
        foodsTable("Sindhi Biryani", "\n" +
                "Servings: 4 | Cook Time: 1hr 30mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- 1⁄4 - 1⁄3 kg mutton\n" +
                "- 1 cup basmati rice (soaked in water for atleast 1/2 an hour)\n" +
                "- 1⁄8 kg potato (cut into large chunks)\n" +
                "- 1⁄3 cup oil\n" +
                "- 5⁄8 medium onions (sliced)\n" +
                "- 1⁄2 teaspoon garlic paste (Lehsan)\n" +
                "- 1⁄2 teaspoon ginger (Adrak)\n" +
                "- 1⁄8 kg tomatoes (chopped)\n" +
                "- 2 -3 prunes (Aaloobukharay)\n" +
                "- 1⁄2 teaspoon salt\n" +
                "- 7⁄8 teaspoon red chili powder\n" +
                "- 2 cloves (Laung)\n" +
                "- 1 5⁄8 green cardamoms (Chhoti Ilaichi)\n" +
                "- 2 pieces black pepper (Kali Mirch)\n" +
                "- 1⁄2 teaspoon cumin seeds (Zeera)\n" +
                "- 1⁄2 cinnamon sticks (Dalchini)\n" +
                "- 7⁄8 black cardamom pods (Bari Ilaichi)\n" +
                "- 1⁄2 bay leaves (Tez Patta)\n" +
                "- 50 g yogurt\n" +
                "- 1 1⁄4 green chilies\n" +
                "- 1⁄2 tablespoon coriander leaves (Dhaniya)\n" +
                "- 1⁄2 tablespoon mint leaves (Podina)\n" +
                "- 5⁄8 teaspoon salt\n" +
                "- 5⁄8 bay leaves\n" +
                "- 5⁄8 cinnamon sticks\n" +
                "- 1⁄2 black cardamom pods\n" +
                "- 1⁄2 pinch orange food coloring\n" +
                "- 1⁄4 tablespoon mint leaf (chopped)\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "1. Slice the onion and fry it in oil until it is light brown. Take out 1/4 of it and keep aside.\n" +
                "\n" +
                "2. Add Garlic (Lehsan), Ginger (Adrak), tomatoes, prunes (Aaloobukharay), salt, red chili powder, cloves, cardamoms, Black Pepper, (Kali Mirch), Cumin Seeds (Zeera), cinnamon, black cardamom pods and bay leaves to the remaining fried onions.\n" +
                "\n" +
                "3. Fry this until the tomatoes are tender and the water is dry.\n" +
                "\n" +
                "4. Then add meat, yogurt and water (if desired) and cook on medium heat until the meat is tender and the water has evaporated.\n" +
                "\n" +
                "5. On other side boil the potatoes until they're half cooked.\n" +
                "\n" +
                "6. Now, add green chillies, mint, coriander leaves, and the half boiled potatoes to the meat. Simmer for 2, 3 minutes. Your meat curry is done.\n" +
                "\n" +
                "7. Boil the rice with salt, bay leaves, cinnamon sticks and black cardamom and drain the water off when the rice is half done.\n" +
                "\n" +
                "8. Layer the curry with the rice in a pot in one on one layers. Sprinkle the food color, fried onions, and chopped mint leaves on top of the last layer.\n" +
                "\n" +
                "9. Close the lid tightly making sure no steam passes out of the pot and cook on low heat until the rice is done.\n" +
                "\n" +
                "10. Gently mix it before serving.\n" +
                "\n" +
                "11. Serve with Raita.","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Pakistani/sindhi_Biryani.jpg");
        foodsTable("Nargisi Kofta Curry", "Servings: 4 | Cook Time: 1hr 15mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- 4 Whole Egg , hard boiled and peeled\n" +
                "- 500 grams Mutton , keema\n" +
                "- 2 tablespoons Ginger , paste\n" +
                "- 2 tablespoons Garlic , paste\n" +
                "- 1 teaspoon Coriander Powder (Dhania)\n" +
                "- 1 teaspoon Turmeric powder (Haldi)\n" +
                "- 1/2 tablespoon Kashmiri Red Chilli Powder\n" +
                "- 1 teaspoon Garam masala powder\n" +
                "- 1 tablespoon Corn flour\n" +
                "- 2 tablespoon Mustard oil\n" +
                "- Salt , to taste\n" +
                "\n" +
                "For gravy :\n" +
                "- 1 cup Curd (Dahi / Yogurt)\n" +
                "- 1 Onion , chopped\n" +
                "- 1 teaspoon Turmeric powder (Haldi)\n" +
                "- 1 tablespoon Green Chilli Paste\n" +
                "- 1 teaspoon Red Chilli powder\n" +
                "- 1 teaspoon Garlic , paste\n" +
                "- 1 teaspoon Ginger , paste\n" +
                "- 1 teaspoon Coriander Powder (Dhania)\n" +
                "- 1 teaspoon Cumin powder (Jeera)\n" +
                "- 1 teaspoon Garam masala powder\n" +
                "- 1 tablespoon Homemade tomato puree\n" +
                "- 1 teaspoon Kasuri Methi (Dried Fenugreek Leaves)\n" +
                "- 1 Bay leaf (tej patta)\n" +
                "- 2 Dry Red Chilli\n" +
                "- Salt , for seasoning\n" +
                "- Oil , as required\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "1. To begin making the Nargisi Kofta Curry recipe, hard boil the eggs in a saucepan with some water. Peel the outer shelf and keep it aside.\n" +
                "\n" +
                "2. In a food processor blend mutton keema very well to make it soft and tender.\n" +
                "\n" +
                "3. Transfer it in a bowl, add turmeric powder, red chilli powder, coriander powder, salt, ginger garlic paste, oil, garam masala powder and corn flour. Mix it very nicely using hands.\n" +
                "\n" +
                "4. Divide the mixture into four parts. Put some oil in your palm and take one portion of keema mixture and pat it to form like a chapati.\n" +
                "\n" +
                "5. Place a hard boiled egg in between the flatten keema mixture and cover the egg with it. Do the same to all eggs. Keep aside.\n" +
                "\n" +
                "6. The next step is to prepare the gravy. Heat oil in a big pan or kadai.\n" +
                "\n" +
                "7. Add dry red chilli and bay leaf. Roast the chilies for a minute then add chopped onions. Fry the onions until light brown.\n" +
                "\n" +
                "8. Add ginger garlic paste, green chilli paste and fry a little bit. Add tomato puree, coriander, cumin, red chilli and turmeric powder. Fry until the oil separates.\n" +
                "\n" +
                "9. Whisk yogurt with salt and add in the masala mixture. Mix well and add one cup of warm water. Let it boil.\n" +
                "\n" +
                "10. After it starts bubbling slowly add keema wrapped egg on the gravy. Let it cook for 30 to 35 minutes.\n" +
                "\n" +
                "11. After 30-35 minutes check the seasoning add garam masala powder and sprinkle some kasuri methi. Serve hot.\n" +
                "\n" +
                "12. Serve Nargisi Kofta Curry along with Boondi Raita, Whole Wheat Lachha Paratha and Kachumber Salad for a weeknight dinner.\n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Pakistani/Nargisi_Kofta_Curry.jpg");
        foodsTable("Achar Gosht", "Servings: 4 | Cook Time: 1hr 15mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- Chicken 750 gm\n" +
                "- Onion 1-1/2 tbsp\n" +
                "- Tomatoes 6-7\n" +
                "- Garlic paste 1-1/2 tbsp\n" +
                "- Ginger paste 1-1/2 tbsp\n" +
                "- Green chilies 10-12\n" +
                "- Yogurt 1-1/2 cup\n" +
                "- Lemon juice 3-4 tbsp\n" +
                "- Oil or clarified butter 1-1/4 cup\n" +
                "- Achar gosht masala 50 gm\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "1. Mix lemon juice in achar gosht masala. Cut green chilies and stuffed masala in it. Heat oil or ghee in pan cook onion till soft. Add chicken, ginger, garlic cook for 1-2 minute. Add remaining achar ghost masala and yogurt mix well. Add 1 cup of water cover and cook. Add tomatoes cook till meat is done. When oil separate add spiced chilies cook for 10 minute on low flame. Add lemon juice . to enhance flavor apply tarka on curry leaves and whole red chilies. Garnish with coriander serve.\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Pakistani/Achar-Gosht.jpg");
        foodsTable("Chicken Handi", "\n" +
                "Servings: 4 | Cook Time: 45mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- 500 gm chicken\n" +
                "- 1 handful mint\n" +
                "- 3 tablespoon yoghurt (curd)\n" +
                "- 1 teaspoon red chilli\n" +
                "- 2 gm black cardamom\n" +
                "- 2 teaspoon garlic paste\n" +
                "- 2 teaspoon coriander powder\n" +
                "- 1/2 cup onion\n" +
                "- 5 tablespoon mustard oil\n" +
                "- 2 teaspoon turmeric\n" +
                "- 4 green cardamom\n" +
                "- 2 teaspoon ginger paste\n" +
                "- 1 teaspoon garam masala powder\n" +
                "- salt as required\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "Step 1 Wash and marinate the chicken :\n" +
                "Clean the chicken pieces completely, pat them dry and add the yoghurt, turmeric powder, red chilli powder, salt, mustard oil and coriander powder. Massage this marination into the chicken pieces and keep them in the fridge for 1-2 hours.\n" +
                "\n" +
                "Step 2 Prepare the masala mix :\n" +
                "Roughly chop the onions, ginger and garlic cloves and add them to a grinder. Add the green and black cardamoms with cinnamon to the grinder and make a thin paste out of them. Add a few drops of water if necessary.\n" +
                "\n" +
                "Step 3 Combine, cook and serve! :\n" +
                "Heat 2-3 tbsp of oil in a pan and add the prepared masala paste to it. Cook it for 1 minute and add the marinated chicken to it. You can add a bit of salt and turmeric at this point. Add 1 cup of water and let this cook for about 12-15 minus on a low flame. You will know it is done when the oil comes to the surface. Garnish with coriander leaves and serve.\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Pakistani/chicken-handi.jpg");
        foodsTable("Reshmi Kebab", "Servings: 4 | Cook Time: 45mins\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "\n" +
                        "I CUP = 240 ML\n" +
                        "\n" +
                        "- 333.33 grams boneless chicken (or breast)(½ lb)\n" +
                        "- 2.67 tablespoons fresh cream\n" +
                        "- 2.67 tablespoons greek yogurt or thick curd or hung yogurt\n" +
                        "- 1.33 to 2 tablespoon lemon juice\n" +
                        "- 0.67 teaspoon ground black pepper (or 1 teaspoon green chilli paste)\n" +
                        "- 2.67 tablespoons coriander leaves(Chopped, cilantro)\n" +
                        "- 2 teaspoon ginger garlic paste or 1 inch ginger 3 to 4 cloves of garlic\n" +
                        "- 0.67 teaspoon salt (adjust to taste)\n" +
                        "- 1.33 teaspoon oil\n" +
                        "- 2.67 tablespoons almond meal (or 12 almonds & 8 cashews or ½ tablespoon cornstarch refer notes)\n" +
                        "- 2.67 tablespoons cheese (optional - cream cheese, cheddar or mozzarella)\n" +
                        "\n" +
                        "For Serving :\n" +
                        "- 1.33 tablespoon butter for brushing\n" +
                        "- 0.67 cup Mint Chutney\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "Preparation for chicken malai kabab :\n" +
                        "1. Add chicken to a bowl and pat dry any excess moisture. This prevents the chicken malai tikkas from letting out lots of\n" +
                        "moisture.\n" +
                        "\n" +
                        "2. In a separate bowl, mix together almond meal, fresh cream, thick yogurt, cheese (optional), lemon juice, oil, salt, black\n" +
                        "pepper, ginger garlic and coriander leaves.\n" +
                        "\n" +
                        "3. Mix them well and taste test. If you want you may add more salt and black pepper to adjust to your taste. This mixture\n" +
                        "should be ideally thick.\n" +
                        "\n" +
                        "4. Pour this over the chicken and mix well. Cover and set aside in the refrigerator for atleast 4 hours to overnight.\n" +
                        "\n" +
                        "How to make reshmi kabab :\n" +
                        "1. Preheat the oven to the highest. At 240 C or 470 F for at least 15 mins.\n" +
                        "\n" +
                        "2. Thread the chicken on the skewers and place them on a prepared baking tray. Grill for 15 mins.\n" +
                        "\n" +
                        "3. Turn them to the other side and grill again for 7 to 8 mins. Check after 22 to 23 mins of grilling to prevent burning.\n" +
                        "\n" +
                        "4. The last 2 minutes grill them on a broil mode for charring. Remove the grilled chicken malai tikkas from the oven and\n" +
                        "brush butter over them.\n" +
                        "\n" +
                        "5. Serve chicken malai kababs with mint chutney.\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Pakistani/malai-chicken-kabab.jpg");
        foodsTable("Bhindi Masala", "Servings: 4 | Cook Time: 45mins\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "For Sautéing :\n" +
                        "- 2.67 tablespoons oil – sunflower oil or peanut oil or any neutral oil\n" +
                        "- 333.33 grams okra (bhindi or lady finger)\n" +
                        "\n" +
                        "Other Ingredients :\n" +
                        "- 1.33 tablespoon oil – sunflower oil or peanut oil or any neutral oil\n" +
                        "- 0.44 cup finely chopped onions or 1 medium-sized onion\n" +
                        "- 1.33 teaspoon Ginger Garlic Paste or 1 inch ginger and 3 to 4 medium garlic cloves, crushed in mortar-pestle\n" +
                        "- 1.33 cup finely chopped tomatoes 2 medium-sized tomatoes\n" +
                        "- 1.33 teaspoon Coriander Powder (ground coriander)\n" +
                        "- 0.67 teaspoon kashmiri red chili powder or ¼ teaspoon red chilli powder or cayenne pepper\n" +
                        "- 0.67 teaspoon turmeric powder\n" +
                        "- 0.67 teaspoon fennel powder (ground fennel), optional\n" +
                        "- 0.67 teaspoon Garam Masala\n" +
                        "- 0.67 teaspoon amchur powder (dry mango powder) or add as required\n" +
                        "- salt as required\n" +
                        "- 0.67 teaspoon kasuri methi – crushed (dry fenugreek leaves ) – optional\n" +
                        "- 2.67 tablespoons chopped coriander leaves\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Rinse the bhindi (okra) well in water for a couple of times.\n" +
                        "\n" +
                        "2. Dry them on a large plate on their own or wipe with a kitchen towel. Make sure there is no moisture or water on the okra pods.\n" +
                        "\n" +
                        "3. Remove the base and stalk while chopping them. Chop into 1 or 1.5 inch pieces.\n" +
                        "\n" +
                        "4. Also chop onions and tomatoes. Keep aside. \n" +
                        "\n" +
                        "5. Make a paste of ginger and garlic in mortar-pestle and keep aside.\n" +
                        "\n" +
                        "Sautéing Bhindi :\n" +
                        "1. Heat 2 tbsp oil in a kadai (wok) or pan.\n" +
                        "\n" +
                        "2. Add the chopped bhindi and sauté stirring often till they are completely cooked. You will have to keep an eye on them and stir in between many times.\n" +
                        "\n" +
                        "3. Taste the sautéed okra and if the crunchiness is not there and the bhindi have become soft, it means they are cooked. Keep the sautéed bhindi aside.\n" +
                        "\n" +
                        "Sautéing Onions, Tomatoes, Spices :\n" +
                        "1. All the oil will be used up. So add 1 tablespoon oil to the same pan.\n" +
                        "\n" +
                        "2. Add chopped onions and sauté stirring often on low to medium heat till they become translucent and are softened.\n" +
                        "\n" +
                        "3. Add the ginger-garlic paste and sauté on low heat for a few seconds or till the raw aroma of the ginger-garlic disappears.\n" +
                        "\n" +
                        "4. Add the chopped tomatoes and saute stirring often till the tomatoes become soft and mushy.\n" +
                        "\n" +
                        "5. If the tomato mixture becomes too dry and starts sticking to the pan, then add about ¼ cup water. Mix well and continue to cook.\n" +
                        "\n" +
                        "6. All the above cooking is done in a open pan and you don’t need to cover the pan with the lid.\n" +
                        "\n" +
                        "7. Add all the dry ground spice powders one by one.\n" +
                        "\n" +
                        "8. Mix well and saute for a few seconds on low heat.\n" +
                        "\n" +
                        "Making Bhindi Masala :\n" +
                        "1. Add the sautéed bhindi, crushed kasuri methi, salt and mix so that the onion-tomato masala coats the okra well.\n" +
                        "\n" +
                        "2. Cook for about 2 minutes. Stir in between. \n" +
                        "\n" +
                        "3.Then turn off the heat and add chopped coriander leaves. Mix again.\n" +
                        "\n" +
                        "4. Serve Bhindi Masala hot or warm garnished with a few coriander leaves and accompanied with chapati, roti or naan.\n" +
                        "It can also be packed for lunch box. ",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Pakistani/bhindi-masala.jpg");
        foodsTable("Afghani Kabli Pulao", "Servings: 6 | Cook Time: 1 hr 39 mins\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "Broth:\n" +
                        "- 1 onion, peeled and halved\n" +
                        "- 1 whole head garlic, loose skins removed\n" +
                        "- 1 cinnamon stick\n" +
                        "- 4 cardamom pods, crushed\n" +
                        "- 1 teaspoon ground black pepper\n" +
                        "- 1 teaspoon cumin seed\n" +
                        "- 1 teaspoon salt\n" +
                        "- 1 teaspoon white sugar\n" +
                        "- 1 teaspoon paprika\n" +
                        "- 1 teaspoon coriander seeds\n" +
                        "- 4 whole cloves\n" +
                        "- 3 ½ cups water, or as needed to cover\n" +
                        "\n" +
                        "Rice:\n" +
                        "- 2 cups sella basmati rice\n" +
                        "- 1 tablespoon canola oil\n" +
                        "- 1 onion, chopped\n" +
                        "- 3 cloves garlic, minced\n" +
                        "- 1 cup matchstick carrots\n" +
                        "- ½ cup raisins\n" +
                        "- ½ cup slivered almonds\n" +
                        "- 1 teaspoon cumin seed\n" +
                        "- 1 teaspoon ground black pepper\n" +
                        "- 1 cardamom pod, shell removed and seeds crushed into a powder\n" +
                        "- 1 whole clove\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Make the broth: Place halved onion, garlic head, cinnamon stick, cardamom pods, pepper, cumin seed, salt, sugar, paprika, coriander seeds, and cloves into a pressure cooker. Pour in water to cover.\n" +
                        "\n" +
                        "2. Close the cooker securely and place the pressure regulator over the vent according to manufacturer's instructions. Set to high and heat until steam escapes in a steady flow and makes a whistling sound, about 5 minutes. Reduce to medium and cook for 20 minutes. Let the pressure release naturally, about 10 minutes. Unlock the lid and remove.\n" +
                        "\n" +
                        "3. When the broth is almost finished, start the rice: Soak rice in cool water for 5 minutes, then rinse until water runs clear.\n" +
                        "\n" +
                        "4. Strain cooled broth into a bowl. Clean out the pressure cooker, then place over medium heat and add oil.\n" +
                        "\n" +
                        "5. Add onion and garlic to the cooker; cook and stir until softened and browned, 7 to 10 minutes. Stir in carrots and cook until soft, about 3 minutes more. Add strained rice, raisins, almonds, cumin seed, pepper, cardamom powder, and clove. Stir to combine, then pour in enough broth to cover.\n" +
                        "\n" +
                        "6. Close the cooker securely and seal the vent; set to high and heat until the first whistle, 5 to 7 minutes. Reduce to medium and cook for 5 minutes. Remove from the heat and let rest for 7 minutes, then let pressure release naturally, about 10 minutes. Immediately transfer cooked rice to a serving dish to prevent overcooking.\n" +
                        "\n" +
                        "Tips :\n" +
                        "- When soaking the rice, you can add chicken or beef bouillon cubes to the water to add flavor, or use broth for soaking instead of water.\n" +
                        "\n" +
                        "- The rice should be soft after soaking; so in Step 5, you only need to add enough broth to cover the rice. If the rice is still hard after soaking, add about 3/8 inch more broth.\n" +
                        "\n" +
                        "Stovetop Directions:\n" +
                        "- Boil broth ingredients for 1 hour. After soaking the rice, combine all rice ingredients and all broth (if broth doesn't measure 3 1/2 cups, add water to get that amount of liquid) and bring to a boil. Reduce the heat to low and place a paper towel over the pot. Cover with a lid and cook until rice is tender, about 25 minutes.\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Pakistani/afgani_pulao.jpg");
        foodsTable("Chana Pulao", "Servings: 6 | Cook Time: 20 mins\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 4 tsp oil\n" +
                        "- 1.33 bay leaf / tej patta\n" +
                        "- 1.33 star anise\n" +
                        "- 6.67 cloves\n" +
                        "- 1.33 inch cinnamon / dalchini\n" +
                        "- 1.33 tsp jeera / cumin\n" +
                        "- 1 tsp aamchur / dry mango powder\n" +
                        "- 1.33 onion, finely chopped\n" +
                        "- 1.33 tsp ginger garlic paste\n" +
                        "- 0.67 tsp garam masala\n" +
                        "- 1.33 to mato, finely chopped\n" +
                        "- 0.33 tsp turmeric\n" +
                        "- 1.33 tsp kashmiri red chilli powder\n" +
                        "- 0.67 tsp coriander powder\n" +
                        "- 0.33 tsp cumin powder\n" +
                        "- 1.33 tsp kasuri methi / dry fenugreek leaves\n" +
                        "- 1.33 tsp salt\n" +
                        "- 2.67 cup water\n" +
                        "- 1.33 cup chickpea / chana, soaked overnight and boiled 10 minutes\n" +
                        "- 1.33 cup basmati rice, soaked 20 minutes\n" +
                        "- coriander to garnish\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. firstly, in a pressure cooker heat 3 tsp oil and saute 1 bay leaf, 1 star anise, 5 cloves, 1 inch cinnamon and 1 tsp jeera till it turns aromatic.\n" +
                        "\n" +
                        "2. saute onion, ginger garlic paste and tomatoes.\n" +
                        "\n" +
                        "3. further add ¼ tsp turmeric, 1 tsp chilli powder, ½ tsp coriander powder, ¼ tsp cumin powder, ½ tsp garam masala, ¾ tsp aamchur, 1 tsp kasuri methi and 1 tsp salt. saute well.\n" +
                        "\n" +
                        "4. now add 1 cup soaked and boiled chickpea and saute for a minute.\n" +
                        "\n" +
                        "5. furthermore add 1 cup basmati rice (soaked for 20 minutes) and saute gently.\n" +
                        "\n" +
                        "6. now add 2 cup water and stir well.\n" +
                        "\n" +
                        "7. cover and pressure cook for 2 whistles.\n" +
                        "\n" +
                        "8. finally, garnish with coriander and serve chana pulao along with onion tomato raita.\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Pakistani/chana-pulao.jpeg");

       CatList("Pakistani", R.drawable.pakistani);

        //----------------------------------------------------

        foodsTable("Chicken Shawarma", "Servings: 4 | Cook Time: 20 mins\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "I CUP = 240 ML\n" +
                        "\n" +
                        "- 1 kg / 2 lb chicken thigh fillets , skinless and boneless (Note 3)\n" +
                        "\n" +
                        "MARINADE :\n" +
                        "- 1 large garlic clove , minced (or 2 small cloves)\n" +
                        "- 1 tbsp ground coriander\n" +
                        "- 1 tbsp ground cumin\n" +
                        "- 1 tbsp ground cardamon\n" +
                        "- 1 tsp ground cayenne pepper (reduce to 1/2 tsp to make it not spicy)\n" +
                        "- 2 tsp smoked paprika\n" +
                        "- 2 tsp salt\n" +
                        "- Black pepper\n" +
                        "- 2 tbsp lemon juice\n" +
                        "- 3 tbsp olive oil\n" +
                        "\n" +
                        "YOGHURT SAUCE :\n" +
                        "- 1 cup Greek yoghurt\n" +
                        "- 1 clove garlic , crushed\n" +
                        "- 1 tsp cumin\n" +
                        "- Squeeze of lemon juice\n" +
                        "- Salt and pepper\n" +
                        "\n" +
                        "TO SERVE :\n" +
                        "- 4 – 5 flatbreads (Lebanese or pita bread orhomemade soft flatbreads)\n" +
                        "- Sliced lettuce (cos or iceberg)\n" +
                        "- Tomato slices\n" +
                        "- Red onion , finely sliced\n" +
                        "- Cheese , shredded (optional)\n" +
                        "- Hot sauce of choice (optional)\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Marinade chicken – Combine the marinade ingredients in a large ziplock bag. Add the chicken, seal, the massage from the outside with your hands to make sure each piece is coated. Marinate 24 hours (minimum 3 hours).\n" +
                        "\n" +
                        "2. Yogurt Sauce – Combine the Yogurt Sauce ingredients in a bowl and mix. Cover and put in the fridge until required (it will last for 3 days in the fridge).\n" +
                        "\n" +
                        "3. Preheat stove or BBQ – Heat a large non-stick skillet with 1 tablespoon over medium high heat, or lightly brush a BBQ hotplate/grills with oil and heat to medium high. (See notes for baking)\n" +
                        "\n" +
                        "4. Cook chicken – Place chicken in the skillet or on the grill and cook the first side for 4 to 5 minutes until nicely charred. Turn and cook the other side for 3 to 4 minutes (the 2nd side takes less time).\n" +
                        "\n" +
                        "5. Rest – Remove chicken from the grill and cover loosely with foil. Set aside to rest for 5 minutes.\n" +
                        "\n" +
                        "TO SERVE :\n" +
                        "1. Slice chicken and pile onto platter alongside flatbreads, Salad and the Yoghurt Sauce (or dairy free Tahini sauce from this recipe).\n" +
                        "\n" +
                        "2. To make a wrap, get a piece of flatbread and smear with Yoghurt Sauce. Top with a bit of lettuce and tomato and Chicken Shawarma. Roll up and enjoy!\n" +
                        "\n" +
                        "Recipe Notes:\n" +
                        "1. MAKE AHEAD: Pop the marinade and chicken in a ziplock bag and freeze straight away. Then as it defrosts, it will marinate!\n" +
                        "This also works well made ahead, which I recently did when I made this for 50 people as part of a multi-course meal. I grilled it in the morning and cut it up. Then prior to serving it was just heated up in the microwave. Toss it with the juices pooled at the bottom of the dish and no one will guess it was cooked earlier in the day!\n" +
                        "\n" +
                        "2. Chicken per serving – If using large lebanese bread as pictured (diameter is almost 30cm/1 foot), you need around 300g/10oz of chicken per person (raw) to fully fill them out without tucking the ends in. 200 – 250g/7 – 8oz per person seems to be enough on average, but I always end up providing more!\n" +
                        "\n" +
                        "3. Chicken – I use 6 pieces approx 5oz/150g each.\n" +
                        "Chicken breast: I feel strongly that this is best made with thigh because it’s got more fat so you get beautiful caramelisation. But it’s still super tasty made with chicken breast. The best way is to cut them in half horizontally to make 2 thin steaks no thicker than 1 cm/ 2/5″ each. If needed, pound lightly. Marinate per recipe. Then cook on a high heat (not medium high per recipe) for just 2 minutes on each side until golden. They will be juicy and beautiful inside!\n" +
                        "\n" +
                        "4. Suggestions for things to make on the side:\n" +
                        "* Mejadra (pictured in post) – Middle Eastern lentil rice\n" +
                        "* Chickpea Rice Pilaf– slightly less spiced than Mejadra\n" +
                        "* Middle Eastern Chickpea Salad (a Yotam Ottolenghi recipe, skip the spicing of chickpeas to keep it fresher)\n" +
                        "Also see 7 Course Arabian Feast (summary below recipe) and above recipe card in post for lengthier list of side options.\n" +
                        "\n" +
                        "5. BAKING: Cooking on a BBQ or stove is best to get the caramelisation. Baking doesn’t yield quite the same flavour – but still very good! Bake at 425F/220C for 20 – 25 minutes until a browned.\n" +
                        "\n" +
                        "6. Nutrition for chicken only because flatbreads vary so much in size and calories.Assuming 6 servings.",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Arabian/Chicken-Shawarma.jpg");
        foodsTable("Falafel", "Servings: 4 | Cook Time: 50 mins\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 2 cups dried chickpeas (Do NOT use canned or cooked chickpeas)\n" +
                        "- ½ tsp baking soda\n" +
                        "- 1 cup fresh parsley leaves, stems removed\n" +
                        "- ¾ cup fresh cilantro leaves, stems removed\n" +
                        "- ½ cup fresh dill, stems removed\n" +
                        "- 1 small onion, quartered\n" +
                        "- 7-8 garlic cloves, peeled\n" +
                        "- Salt to taste\n" +
                        "- 1 tbsp ground black pepper\n" +
                        "- 1 tbsp ground cumin\n" +
                        "- 1 tbsp ground coriander\n" +
                        "- 1 tsp cayenne pepper, optional\n" +
                        "- 1 tsp baking powder\n" +
                        "- 2 tbsp toasted sesame seeds\n" +
                        "- Oil for frying\n" +
                        "\n" +
                        "Falafel Sauce :\n" +
                        "- Tahini Sauce\n" +
                        "\n" +
                        "Fixings for falafel sandwich (optional):\n" +
                        "- Pita pockets\n" +
                        "- English cucumbers, chopped or diced\n" +
                        "- Tomatoes, chopped or diced\n" +
                        "- Baby Arugula\n" +
                        "- Pickles\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. (One day in advance) Place the dried chickpeas and baking soda in a large bowl filled with water to cover the chickpeas by at least 2 inches. Soak overnight for 18 hours (longer  if the chickpeas are still too hard). When ready, drain the chickpeas completely and pat them dry.\n" +
                        "\n" +
                        "2. Add the chickpeas, herbs, onions, garlic and spices to the large bowl of a food processor fitted with a blade. Run the food processor 40 seconds at a time until all is well combined forming a the falafel mixture.\n" +
                        "\n" +
                        "3. Transfer the falafel mixture to a container and cover tightly. Refrigerate for at least 1 hour or (up to one whole night) until ready to cook.\n" +
                        "\n" +
                        "4. Just before frying, add the baking powder and sesame seeds to the falafel mixture and stir with a spoon.\n" +
                        "\n" +
                        "5. Scoop tablespoonfuls of the falafel mixture and form into patties (½ inch in thickness each). It helps to have wet hands as you form the patties.\n" +
                        "\n" +
                        "6. Fill a medium saucepan 3 inches up with oil. Heat the oil on medium-high until it bubbles softly. Carefully drop the falafel patties in the oil, let them fry for about 3 to 5 minutes or so until crispy and medium brown on the outside. Avoid crowding the falafel in the saucepan, fry them in batches if necessary.\n" +
                        "\n" +
                        "7. Place the fried falafel patties in a colander or plate lined with paper towels to drain.\n" +
                        "\n" +
                        "8. Serve falafel hot next to other small plates; or assemble the falafel patties in pita bread with tahini or hummus, arugula, tomato and cucumbers. Enjoy!\n" +
                        "\n" +
                        "\n" +
                        "NOTES :\n" +
                        "- Cook's Tip: You need to start with dry chickpeas, do not use canned chickpeas here. You will need to begin soaking the chickpeas overnight, allow up to 24 hours.\n" +
                        "- Falafel Recipe variations: Variations of this recipe may call for flour or eggs. If you prefer, you can add 1 to 1 ½ tablespoon of flour to the falafel mix or 1 egg. I did not use either, and the falafel mixture stayed well together.\n" +
                        "- Pro Tip for Frying: When you fry the falafel patties, you want to achieve a deep golden brown color on the outside. More importantly, the patties need to be fully done on the inside. Your frying oil needs to be at 375 degrees F, for my stove, that was at a medium-high temp. Be sure to test your first batch and adjust the frying time as needed.\n" +
                        "- Have an air fryer? Try this air fryer falafel recipe.\n" +
                        "- Popular falafel sauce: tahini sauce is what is traditionally used with falafel. I use organic tahini paste by Soom, and here is my tahini sauce recipe.\n" +
                        "- Baked Falafel Option: If you prefer, you can bake the falafel patties in a 350 degree F heated oven for about 15-20 minutes, turning them over midway through. Use a lightly oiled sheet pan, and you might like to give the patties a quick brush of extra virgin olive oil before baking.\n" +
                        "- Pro-Tip for Make-Ahead: To make ahead and freeze, prepare the falafel mixture and divide into patties (up to step #6). Place the patties on a baking sheet lined with parchment paper and freeze. When they harden, you can transfer the falafel patties into a freezer bag. They will keep well in the freezer for a month or so. You can fry or bake them from frozen.\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Arabian/falafel-recipe.jpg");
        foodsTable("Hummus", "Servings: 4 | Cook Time: 10 mins\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 1 (15-ounce) can chickpeas or 1 ½ cups (250 grams) cooked chickpeas\n" +
                        "- 1/4 cup (60 ml) fresh lemon juice, 1 large lemon\n" +
                        "- 1/4 cup (60 ml) well-stirred tahini, see our homemade tahini recipe\n" +
                        "- 1 small garlic clove, minced\n" +
                        "- 2 tablespoons (30 ml) extra-virgin olive oil, plus more for serving\n" +
                        "- 1/2 teaspoon ground cumin\n" +
                        "- Salt to taste\n" +
                        "- 2 to 3 tablespoons (30 to 45 ml) water or aquafaba, see notes\n" +
                        "- Dash ground paprika or sumac, for serving\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. In the bowl of a food processor, combine the tahini and lemon juice and process for 1 minute, scrape the sides and bottom of the bowl then process for 30 seconds more. This extra time helps “whip” or “cream” the tahini, making the hummus smooth and creamy.\n" +
                        "\n" +
                        "2. Add the olive oil, minced garlic, cumin, and a 1/2 teaspoon of salt to the whipped tahini and lemon juice. Process for 30 seconds, scrape the sides and bottom of the bowl then process another 30 seconds or until well blended. Open, drain, and rinse the chickpeas. Add half of the chickpeas to the food processor and process for 1 minute. Scrape sides and bottom of the bowl, then add remaining chickpeas and process until thick and quite smooth; 1 to 2 minutes.\n" +
                        "\n" +
                        "3. Most likely the hummus will be too thick or still have tiny bits of chickpea. To fix this, with the food processor turned on, slowly add 2 to 3 tablespoons of water until you reach the perfect consistency.\n" +
                        "\n" +
                        "4. Taste for salt and adjust as needed. Serve hummus with a drizzle of olive oil and dash of paprika. Store homemade hummus in an airtight container and refrigerate up to one week.\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Arabian/Hummus.jpg");
        foodsTable("Steak Kebabs", "Servings: 5 | Cook Time: 3 hours 35 minutes\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "Marinade :\n" +
                        "- 1/4 c olive oil\n" +
                        "- 1/4 c soy sauce\n" +
                        "- 1 1/2 tbsp fresh lemon juice\n" +
                        "- 1 1/2 tbsp red wine vinegar\n" +
                        "- 2 1/2 tbsp Worcestershire sauce\n" +
                        "- 1 tbsp honey\n" +
                        "- 2 tsp Dijon\n" +
                        "- 1 tbsp minced garlic\n" +
                        "- 1 tsp freshly ground black pepper\n" +
                        "\n" +
                        "Kebabs :\n" +
                        "- 1 3/4 lbs sirloin steak (look for thicker steaks), cut into 1 1/4 inch pieces\n" +
                        "- 8 oz button or cremini mushrooms, halved (unless small, keep whole)\n" +
                        "- 3 bell peppers (1 red, 1 green, 1 yellow) cut into 1 1/4-inch pieces\n" +
                        "- 1 large red onion diced into chunks (about 1 1/4-inch)\n" +
                        "- 1 Tbsp olive oil, plus more for brushing grill grates\n" +
                        "- Salt and freshly ground black pepper\n" +
                        "- 1/2 tsp garlic powder\n" +
                        "- 10 wooden skewer sticks soaked in water for at least 30 minutes\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. For the marinade: In a mixing bowl whisk together all marinade ingredients.\n" +
                        "\n" +
                        "2. For the kebabs: place steak into a gallon size resealable bag. Pour marinade over steak then seal bag while pressing out excess air and massage marinade over steak. Transfer to refrigerator and allow to marinate 3 - 6 hours.\n" +
                        "\n" +
                        "3. Preheat a grill over medium-high heat to about 425 degrees (partway through preheating clean grill grates if they aren't already clean).\n" +
                        "\n" +
                        "4. With veggies on cutting board, drizzle with oil and lightly toss to coat (I actually don't toss the onion because I like it to stay in chunks, when you thread the onion on layer in chunks about 2 - 3 slices so they don't burn up).\n" +
                        "\n" +
                        "5. Sprinkle veggies evenly with garlic powder and season with salt and pepper. To assemble kebabs layer steak and veggies onto kebabs in desired order, work to fit 4 steak pieces onto each kebab (I like to layer 2 onion slices together).\n" +
                        "\n" +
                        "6. Brush grill grates lightly with oil. Place kebabs on grill and grill until center of steak registers about 140 - 145 degrees for medium doneness, turning kebabs occasionally, about 8 - 9 minutes. Serve warm.",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Arabian/steak-kebabs.jpg");
        foodsTable("Tabbouleh Salad", "Servings: 6 | Cook Time:  40 mins\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- ⅓ cup extra-virgin olive oil\n" +
                        "- 3 tablespoons lemon juice\n" +
                        "- ¼ teaspoon salt\n" +
                        "- ¼ teaspoon black pepper\n" +
                        "- ¼ cup fine #1 bulgur\n" +
                        "- 2 bunches fresh curly parsley finely chopped (about 3 cups)\n" +
                        "- 2 firm tomatoes finely chopped\n" +
                        "- 2 green onions finely chopped\n" +
                        "- ¼ cup fresh mint leaves finely chopped\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Whisk the olive oil, lemon juice, salt, and pepper in a large bowl until well combined. Stir in the bulgur. Let the grains soak up the dressing until they are plump and most of the moisture is absorbed for about 20 to 30 minutes.\n" +
                        "\n" +
                        "2. Meanwhile, add the parsley, tomatoes, green onions, and mint to one side of the large bowl with the bulgur, but don’t mix yet.\n" +
                        "\n" +
                        "3. When the bulgur is plump, and the lemon-olive oil mixture is mostly absorbed, stir everything together until well combined. Serve at room temperature or chilled from the fridge.\n" +
                        "\n" +
                        "\n" +
                        "NOTES:\n" +
                        "- Storage: Store any leftovers in an airtight container. They will last about 3-4 days in the fridge.\n" +
                        "- Make Ahead Tips: I would highly recommend washing and drying the parsley a day or two days in advance of chopping it. This gives the parsley time to dry properly so that when you chop it, it doesn’t turn into a wet mess.\n" +
                        "- Sourcing: You can find the fine bulgur at Middle Eastern markets, natural-foods stores or even in large supermarkets, often located with other Middle Eastern ingredients. Make sure it does not require cooking for this recipe.\n" +
                        "- Substitutes: For best results, follow the recipe as is. If you want to make this grain-free, you can substitute the bulgur for quinoa or even riced cauliflower.\n" +
                        "\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Arabian/Lebanese-Tabbouleh.jpg");
       foodsTable("Baba Ganoush", "Servings: 6 | Cook Time:  55 mins\n" +
                       "\n" +
                       "INGREDIENTS :\n" +
                       "\n" +
                       "- 2 pounds Italian eggplants (about 2 small-to-medium eggplants*)\n" +
                       "- 2 medium cloves of garlic, pressed or minced\n" +
                       "- 2 tablespoons lemon juice, more if necessary\n" +
                       "- ¼ cup tahini\n" +
                       "- ⅓ cup extra-virgin olive oil, plus more for brushing the eggplant and garnish\n" +
                       "- 2 tablespoons chopped fresh flat-leaf parsley, plus extra for garnish\n" +
                       "- ¾ teaspoon salt, to taste\n" +
                       "- ¼ teaspoon ground cumin\n" +
                       "- Pinch of smoked paprika, for garnish\n" +
                       "- Serving suggestions: warmed or toasted pita wedges, carrot sticks, bell pepper strips, cucumber slices, etc.\n" +
                       "--------------------------\n" +
                       "\n" +
                       "Instructions :\n" +
                       "\n" +
                       "1. Preheat the oven to 450 degrees Fahrenheit with a rack in the upper third of the oven. Line a large, rimmed baking sheet with parchment paper to prevent the eggplant from sticking to the pan. Halve the eggplants lengthwise and brush the cut sides lightly with olive oil. Place them in the prepared pan with the halved sides down.\n" +
                       "\n" +
                       "2. Roast the eggplant until the interior is very tender throughout and the skin is collapsing, about 35 to 40 minutes (this might take longer if you are using 1 large eggplant). Set the eggplant aside to cool for a few minutes. Flip the eggplants over and scoop out the flesh with a large spoon, leaving the skin behind.\n" +
                       "\n" +
                       "3. Place a mesh strainer over a mixing bowl, then transfer the flesh to the strainer and discard the skins. Pick out any stray bits of eggplant skin and discard. You want to remove as much moisture from the eggplant here as possible, so let the eggplant rest for a few minutes and shake/stir the eggplant to release some more moisture.\n" +
                       "\n" +
                       "4. Discard all of the eggplant drippings, drain and wipe out the bowl, and dump the eggplant into the bowl. Add the garlic and lemon juice to the eggplant and stir vigorously with a fork until eggplant breaks down. Add the tahini to the bowl and stir until it’s incorporated. While stirring, slowly drizzle in the olive oil. Continue stirring until the mixture is pale and creamy, and use your fork to break up any particularly long strings of eggplant.\n" +
                       "\n" +
                       "5. Stir in the parsley, salt and cumin. Season to taste with more salt (I usually add another ¼ teaspoon) and more lemon juice, if you’d like a more tart flavor.\n" +
                       "\n" +
                       "6.Transfer the baba ganoush to a serving bowl and lightly drizzle olive oil on top. Lastly, sprinkle parsley and smoked paprika on top. Serve with accompaniments of your choice. It’s also great on sandwiches!\n",
               "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Arabian/best-baba-ganoush-reci.jpg");
        foodsTable("Mansaf", "Servings: 4 | Cook Time: 2 hours 20 minutes\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "For the Meat :\n" +
                        "- 1.33 lbs Lamb Meat cut into chunks (including bones)\n" +
                        "- 4 cups Water\n" +
                        "- 1.33 crystals Gum Arabic\n" +
                        "- 2.67 Cloves whole\n" +
                        "- 2.67 Cardamom pods\n" +
                        "- 0.67 Cinnamon Stick\n" +
                        "- 8.67 Allspice berries\n" +
                        "- 0.67 Bay Leaf\n" +
                        "\n" +
                        "For the Rice :\n" +
                        "- 1.33 cups Rice\n" +
                        "- 2.67 cups Water\n" +
                        "- 1 tsp Salt\n" +
                        "- Pinch of Saffron\n" +
                        "\n" +
                        "For the Laban Sauce :\n" +
                        "- 0.67 Laban Jameed\n" +
                        "- 2.67 cups Water\n" +
                        "\n" +
                        "For the Bread Base:\n" +
                        "- 1.33 loaves shrak or tortillas\n" +
                        "\n" +
                        "For the Topping :\n" +
                        "- 2.67 tbsp Almonds blanched and chopped\n" +
                        "- 0.17 cup Parsley chopped\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "For the Meat :\n" +
                        "1. Put the lamb in 6 cups of water, bring to a boil and add the spices.\n" +
                        "\n" +
                        "2. When the water comes to a boil turn down to a slow simmer.\n" +
                        "\n" +
                        "3. Cook for 2 hours or until the meat is tender. Add more boiling water if necessary.\n" +
                        "\n" +
                        "4. Once the meat is done, pour through a sieve and preserve the water. Set the meat aside on a plate for later.\n" +
                        "\n" +
                        "For the Laban Sauce :\n" +
                        "1. Wrap the laban in a cloth and break into pieces with a hammer.\n" +
                        "\n" +
                        "2. Place the laban and 4 cups of water in a food processor and process until laban has dissolved.\n" +
                        "\n" +
                        "3. Pour laban into a bowl through a sieve, set aside.\n" +
                        "\n" +
                        "4. Pour the laban into the meat water, and put back on the heat. Bring to a boil.\n" +
                        "\n" +
                        "5. Add the lamb chunks to the sauce (leaving out the spices).\n" +
                        "\n" +
                        "For the Rice :\n" +
                        "1. In a pot, put 2 cups rice, 4 cups water, 1½ tsp salt and a pinch of saffron.\n" +
                        "\n" +
                        "2. Bring to a boil, then reduce to a simmer and cook until all the water has gone.\n" +
                        "\n" +
                        "Bringing It All Together :\n" +
                        "1. Toast your almonds in a frying pan with a little olive oil.\n" +
                        "\n" +
                        "2. Tear bread into little pieces on a plate as a base for the meal.\n" +
                        "\n" +
                        "3. Ladle some of the sauce over the bread on the plate.\n" +
                        "\n" +
                        "4. Spread the rice over the bread.\n" +
                        "\n" +
                        "5. Ladle more sauce over the rice.\n" +
                        "\n" +
                        "6. Place the lamb chunks on top of the rice.\n" +
                        "\n" +
                        "7. Ladle more sauce over the top.\n" +
                        "\n" +
                        "8. Sprinkle toasted almonds and parsley over the entire dish.",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Arabian/mansaf.jpg");
        foodsTable("Dolma", "Servings: 4 | Cook Time: 1 hours 20 minutes\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 60 vine leaves, drained and rinsed\n" +
                        "- 250g rice (1 cup)\n" +
                        "- 1 cup olive oil\n" +
                        "- 2 onions, finely chopped\n" +
                        "- 2 cups warm water\n" +
                        "- juice of 2 lemons\n" +
                        "- 2 tbsps dill, chopped\n" +
                        "- 1/2 a cup parsley, chopped\n" +
                        "- salt and pepper\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. To make this traditional Greek dolmades recipe (stuffed vine/ grape leaves), start by preparing the vine leaves. For this dolmades recipe, you can either use vine leaves sold in jars or fresh (if you are lucky enough to find them). If you use the ones in jar, rinse the vine leaves, remove the stems and leave them in a colander to drain. If using fresh vine leaves, wash them thoroughly, remove the stems and blanch them in boiling hot water. Remove the leaves with a slotted spoon and place them in a colander to cool down completely.\n" +
                        "\n" +
                        "2. Prepare the filling for the stuffed vine/ grape leaves (dolmades). Place the rice in a colander and rinse with running water. Heat a large saucepan over medium heat, add 1/3 of the olive oil and the chopped onions. Sauté the onions, until translucent (but not coloured). Add the rice and sauté for 1 more minute. Pour in 2 cups of warm water and half lemon juice and simmer for about 7 minutes, until the rice absorbs all the water and is parboiled. Season with salt and pepper, stir in the herbs, remove from the stove and set aside to cool down for a while. This will be the filling for the dolmades.\n" +
                        "\n" +
                        "3. Layer the bottom of a large pot with some vine leaves (use the ones that are little bit torn) and start rolling the dolmadakia. (This is probably the most difficult part of the traditional dolmades recipe). Place one vine leaf (shiny side down) on a flat surface and add 1 tsp of the filling at the bottom end (stem). Be careful not to overfill the dolmades, as the rice will expand during cooking. Fold the lower section of the leaf over the filling towards the center; bring the two sides in towards the center and roll them up tightly. Place the stuffed vine leaves (fold side down) on the bottom of the pot and top in snugly layers. Be careful not to leave any gaps between the dolmades to prevent them from cracking open when cooking.\n" +
                        "\n" +
                        "4. Drizzle the stuffed vine leaves (dolmathes) with the rest of the olive oil and lemon juice and season with salt and pepper. Place an inverted plate on top to hold them down when cooking and pour in enough water just to cover them. Place the lid on and simmer the dolmades for about 30-40 minutes, until the water has been absorbed and the dolmades remain only with the oil.\n" +
                        "\n" +
                        "5. Remove the pot from the heat, remove the lid and plate and let the dolmades cool for at least 30 minutes.\n" +
                        "\n" +
                        "6. Serve this delicious Greek appetizer cold or at room temperature with a squeeze of a lemon. Give this traditional dolmades recipe a try and enjoy your own fresh homemade stuffed grape leaves (dolmades)!\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Arabian/Greek-Dolmades-recipe.jpg");
        foodsTable("Maqluba", "Servings: 4 | Cook Time: 1 hours 10 minutes\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "For the meat and broth:\n" +
                        "- 400 g - 900g of lamb or veal pieces approx. 1.5 lbs to 2 lbs per preference - see note 1\n" +
                        "- 1.33 tablespoons vegetable oil\n" +
                        "- 1.33 cinnamon sticks\n" +
                        "- 2.67 pods green cardamom\n" +
                        "- 2 bay leaves\n" +
                        "- 2.67 whole allspice or black peppercorn optional but recommended\n" +
                        "- 2.67 whole cloves optional but recommended\n" +
                        "- 0.33 teaspoon turmeric\n" +
                        "- 2.67 tablespoons tomato paste\n" +
                        "- 2.33 teaspoons salt\n" +
                        "- 1 teaspoons black pepper\n" +
                        "- 2 cups water\n" +
                        "\n" +
                        "For the Eggplant:\n" +
                        "- 1.33 eggplants approximately 700g\n" +
                        "- 0.33 teaspoon salt\n" +
                        "- 2.67 tablespoons vegetable oil\n" +
                        "\n" +
                        "For the potato:\n" +
                        "- 1.33 large potatoes or 4 small ones per preference\n" +
                        "- 0.17 teaspoon salt\n" +
                        "- 0.67 tablespoon vegetable oil\n" +
                        "\n" +
                        "For the onions and peppers:\n" +
                        "- 0.67 large onion\n" +
                        "- 0.67 large bell pepper red or orange, not green\n" +
                        "- 0.17 teaspoon salt\n" +
                        "- 1.33 tablespoons vegetable oil\n" +
                        "\n" +
                        "For the rice:\n" +
                        "- 1.67 cups basmati rice\n" +
                        "- 3.67 cups total liquid combination of the meat broth and additional water\n" +
                        "- 0.67 tomato\n" +
                        "\n" +
                        "For the garnish (optional):\n" +
                        "- 0.33 cup slivered or blanched almonds or pine nuts\n" +
                        "- 0.33 cup chopped parsley\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Start by preheating the oven to 450F \n" +
                        "\n" +
                        "2. Wash the eggplant and peel it every other stripe as shown in the ingredients photo. Cut into into thick slices, about half an inch thick\n" +
                        "\n" +
                        "3. Wash and peel the potatoes, and cut them into roughly half inch thick circles\n" +
                        "\n" +
                        "4. Place the eggplant and the potato on a lined baking sheet. Sprinkle them with salt and combine them with the oil (the amounts under the ingredients section). Bake for 30 minutes.\n" +
                        "\n" +
                        "5. Wash the meat and sear it on medium high heat using the 2 tablespoons of oil. Add the 3 cups of water and all the whole spices and pressure cook for 10 minutes. If you are not using a pressure cooker, boil on stove top covered on medium heat for 40-60 minutes until tender.\n" +
                        "\n" +
                        "6. Cut the onion and pepper into wings or slices. Cook with the oil in a pan over medium heat for 7 minutes until softened. Set aside.\n" +
                        "\n" +
                        "7. Once the meat is cooked, remove it and set aside. Strain the stock from the whole spices.\n" +
                        "\n" +
                        "8. To the hot stock (in a bowl or a pot), add the turmeric, salt, black pepper and tomato paste. Mix well to combine and add additional water to reach the 5.5 cups required. I do this by using a measuring cup to measure the total amount of stick then top it up with water until I reach 5.5 cups\n" +
                        "\n" +
                        "9. Wash the rice several times until the water runs clear. Drain it and set aside\n" +
                        "\n" +
                        "10. Cut the tomato into slices\n" +
                        "\n" +
                        "11. To layer the maqluba, start by adding 2 tablespoons of oil to the bottom of the pot, then add the tomato slices, followed by eggplant, potato, meat, onions and peppers, then the rice\n" +
                        "\n" +
                        "12. Pat the rice down firmly, then pour the stock on top. Pat down again using a wooden spoon to ensure the stock is fully covering the rice\n" +
                        "\n" +
                        "13. Place the pot on medium high heat and allow it to start bubbling, which should take 5 minutes or so\n" +
                        "\n" +
                        "14. Once it is bubbling, cover it and decrease the heat to low. Ensure the pot is well covered by also adding a towel on top, especially if your pot has any holes. Cook for 50 minutes.\n" +
                        "\n" +
                        "15. After 50 minutes, turn heat off and allow maqluba to rest for 5-10 minutes. If you open it and realize your top layer of rice is undercooked or under seasoned, read the troubleshooting section\n" +
                        "\n" +
                        "16. When ready to serve, find a large tray with raised edges and place it on top of the pot. Use both hands and place them on each handle while holding the tray down. In a swift motion, flip the pot over (have someone nearby to help you if you need it). Leave the pot flipped over the tray for a few minutes and allow gravity to slowly drop the maqluba\n" +
                        "\n" +
                        "17. Lift the pot very slowly to help keep it intact. Serve with yogurt or Jajik and enjoy!\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Arabian/Maqluba.jpg");
      foodsTable("Mandi", "Servings: 4 | Cook Time: 2 hours \n" +
                      "\n" +
                      "INGREDIENTS :\n" +
                      "\n" +
                      "- 500 grams Chicken , with bones\n" +
                      "- 1 Onion , finely chopped\n" +
                      "- 1 Tomato\n" +
                      "- 3 Green Chillies\n" +
                      "- 1 tablespoon Ginger Garlic Paste\n" +
                      "- 3 Bay leaves (tej patta)\n" +
                      "- 1 teaspoon Ghee\n" +
                      "- 2 Cardamom (Elaichi) Pods/Seeds\n" +
                      "- 2 Cloves (Laung)\n" +
                      "- 2 inch Cinnamon Stick (Dalchini)\n" +
                      "- 1 teaspoon Whole Black Peppercorns\n" +
                      "- 2 tablespoons Extra Virgin Olive Oil\n" +
                      "- 2 tablespoons Butter (Salted) , softened\n" +
                      "- Salt , to taste\n" +
                      "- 2 cups Basmati rice\n" +
                      "- 4 cups Water\n" +
                      "\n" +
                      "For mandi spice powder:\n" +
                      "- 1 tablespoon Cardamom (Elaichi) Pods/Seeds\n" +
                      "- 1 tablespoon Cloves (Laung)\n" +
                      "- 1/2 tablespoon Whole Black Peppercorns\n" +
                      "- 1/2 teaspoon Nutmeg powder\n" +
                      "- 1/2 tablespoon Dry ginger powder\n" +
                      "- 2 Bay leaves (tej patta)\n" +
                      "\n" +
                      "--------------------------\n" +
                      "\n" +
                      "Instructions :\n" +
                      "\n" +
                      "1. To begin making the Arabian Chicken Mandi recipe, firstly we will prepare the Mandi spice powder.\n" +
                      "\n" +
                      "For mandi spice powder :\n" +
                      "1. To make the Mandi spice powder, dry roast the cardamom pods, cloves, black pepper, nutmeg dry ginger powder and bay leaves in a on on medium heat for 4-6 minutes.\n" +
                      "\n" +
                      "2. Turn off the heat, and allow it to cool. \n" +
                      "\n" +
                      "3. Transfer the spices in a mixer jar, and grind into a fine powder using a mixer grinder. \n" +
                      "\n" +
                      "For the Chicken :\n" +
                      "1. Heat a large saucepan on medium heat and add oil.\n" +
                      "\n" +
                      "2. Once the oil is hot, add finely chopped onion and sauté till translucent . This will take about 2-3 minutes. \n" +
                      "\n" +
                      "3. To the softened onions,  add the ginger paste and garlic paste and sauté till the raw smell goes away. \n" +
                      "\n" +
                      "4. Next, add bay leaves, cinnamon, cardamom, cloves and black pepper and mix everything well.\n" +
                      "\n" +
                      "5. In a mixer jar combine, tomato and green chillies and grind into a puree and add it to the pan.\n" +
                      "\n" +
                      "6. When the oil starts to separate, add the chicken and mix. Add 4 cups of water and the Mandi spice powder according to your taste.   Mix, cover and let it cook for about 15 minutes. After 15 minutes, turn off the heat. \n" +
                      "\n" +
                      "7. We will furthermore bake the chicken, to get a crispy skin. \n" +
                      "\n" +
                      "8. In a small mixing bowl, add soft butter and Mandi spice powder and some salt, mix well and keep aside. \n" +
                      "\n" +
                      "9. Preheat the oven to 200 degrees centigrade. Remove the chicken from the stock and place it  onto a baking tray and brush with butter and mandi spice powder mixture. \n" +
                      "\n" +
                      "10. Bake for 20 to 25 minutes or until the skin of the chicken turns to a nice golden brown colour.\n" +
                      "\n" +
                      "For the rice :\n" +
                      "1. Wash and soak basmati rice for at least 20 minutes.\n" +
                      "\n" +
                      "2. Heat olive oil in a large pan on medium heat, and fry the drained rice, stirring continuously for about 10 to 15 minutes. \n" +
                      "\n" +
                      "3. Add this pan roasted rice to the chicken stock. Now slide a large piece of aluminium foil on top of the saucepan and then cover it with the lid. Cook the rice on medium low flame for about 10 minutes.\n" +
                      "\n" +
                      "4. Remove the lid and check if there is any trace of water left. If water is left, then cover and cook for another 3 to 5 minutes. Now fluff the rice with a fork .\n" +
                      "\n" +
                      "5. Take ghee in a small bowl and place it in the middle of the rice.\n" +
                      "\n" +
                      "6. Heat a piece of charcoal on direct flame until it is sred hot, this will take about 5 minutes.\n" +
                      "\n" +
                      "7. Once the charcoal is burning hot, place it in the bowl of ghee that is in the rice. Immediately slide back the aluminium foil and secure with lid.\n" +
                      "\n" +
                      "8. Open it only at the time of serving, as it gives a nice smokey flavor to the rice. To serve, spread rice onto a large serving tray and place a piece of baked chicken on the top.\n" +
                      "\n" +
                      "9. Serve Arabian Chicken Mandi with Raw Mango raita and Pickled onions for a delicious weeknight dinner. \n",
              "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Arabian/Arabian_Chicken_Mandhi.jpg");
        foodsTable("Kabsa", "Servings: 4 | Cook Time: 2 hours 15 minutes\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "KABSA SPICE MIX:\n" +
                "- 1/4 tsp ground cardamom (cardamom powder)\n" +
                "- 1/4 tsp ground white pepper (white pepper powder)\n" +
                "- 1/4 tsp saffron\n" +
                "- 1/2 tsp ground cinnamon (cinnamon powder)\n" +
                "- 1/2 tsp ground all spice\n" +
                "- 1/2 tsp dried whole lime powder\n" +
                "\n" +
                "CHICKEN KABSA:\n" +
                "- 2 tbsp oil or butter\n" +
                "- 3 onions, sliced\n" +
                "- 1 tbsp minced ginger (ginger paste)\n" +
                "- 1 tbsp minced garlic (garlic paste)\n" +
                "- 1 green chili\n" +
                "- 2 dried bay leaves\n" +
                "- 6 cloves\n" +
                "- 4 cardamom pods\n" +
                "- 1 cinnamon stick\n" +
                "- 2 tbsp tomato puree (tomato paste)\n" +
                "- 1 pinch ground nutmeg (nutmeg powder)\n" +
                "- 1/2 tsp ground black pepper (black pepper powder)\n" +
                "- 1/4 tsp ground cumin (cumin powder)\n" +
                "- 1/2 tsp ground coriander (coriander powder)\n" +
                "- 3 medium carrots, thinly sliced\n" +
                "- 200 g canned diced tomatoes (or 3 tomatoes chopped)\n" +
                "- 2 chicken stock cubes\n" +
                "- 1 1/2 kg whole chicken, cut into 6 pieces\n" +
                "- 3 cups basmati rice, rinsed\n" +
                "- 1/4 cup raisins\n" +
                "- Water\n" +
                "- Salt to taste\n" +
                "- Raisins, to garnish (optional)\n" +
                "- Slivered almonds, to garnish (optional)\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "1. To make kabsa spice mix, combine together cardamom, white pepper, saffron, cinnamon, all spice and lime powder in a bowl. Set aside.\n" +
                "\n" +
                "2. Heat oil in a large heavy bottomed pan over medium-high heat. Add onions, ginger, garlic and green chilies. Sauté for 2-3 minutes or until the onions turn golden brown. Add bay leaves, cloves, cardamom pods and cinnamon stick. Fry for a minute.\n" +
                "\n" +
                "3. Stir in tomato purée. Add ground nutmeg, ground black pepper, ground cumin, ground coriander and kabsa spice. Season with salt. Fry the spices for a minute. Add carrots and diced tomatoes. Stir, and cook for 2 minutes.\n" +
                "\n" +
                "4. Add chicken cubes and chicken pieces. Brown chicken, turning occasionally, for about 30 minutes. Remove the chicken pieces from the pan. Set aside.\n" +
                "\n" +
                "5. Add rice and raisins. Pour in 4 cups water. Season with salt. Bring it to the boil. Reduce the heat, cover with lid, and simmer for 10-15 minutes.\n" +
                "\n" +
                "6. Preheat grill. Grill chicken for 10-15 minutes or until cooked through. Serve rice with grilled chicken.\n" +
                "\n" +
                "NOTES :\n" +
                "- For rice, start with 3 cups of water, and then add more if needed.\n" +
                "- Whole lime powder is available in Middle Eastern grocery stores\n"
                ,"https://appdeveloperrakib.com/Tasty%20Dishes/Images/Arabian/chicken-kabsa-2B.jpg");
        foodsTable("Baklava", "Servings: 4 | Cook Time: 1 hours 15 minutes\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- 1 (16 ounce) package phyllo dough\n" +
                "- 1 pound chopped nuts\n" +
                "- 1 cup butter\n" +
                "- 1 teaspoon ground cinnamon\n" +
                "- 1 cup water\n" +
                "- 1 cup white sugar\n" +
                "- 1 teaspoon vanilla extract\n" +
                "- ½ cup honey\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "STEP - 01 :\n" +
                "Gather all ingredients.\n" +
                "\n" +
                "STEP - 02 :\n" +
                "Preheat the oven to 350 degrees F(175 degrees C). Butter the bottoms and sides of a 9x13-inch pan.\n" +
                "\n" +
                "STEP - 03 :\n" +
                "Chop nuts and toss with cinnamon. Set aside.\n" +
                "\n" +
                "STEP - 04 :\n" +
                "Unroll phyllo dough. Cut whole stack in half to fit pan. Cover phyllo with a dampened cloth to keep from drying out as you work. Place two sheets of dough in pan, butter thoroughly. Repeat until you have 8 sheets layered.\n" +
                "\n" +
                "STEP - 05 :\n" +
                "Sprinkle 2 to 3 tablespoons of nut mixture on top. Top with two sheets of dough, butter, nuts, layering as you go. The top layer should be about 6 to 8 sheets deep.\n" +
                "\n" +
                "STEP - 06 :\n" +
                "Using a sharp knife cut into diamond or square shapes all the way to the bottom of the pan. You may cut into 4 long rows then make diagonal cuts. Bake for about 50 minutes until baklava is golden and crisp.\n" +
                "\n" +
                "STEP - 07 :\n" +
                "Make sauce while baklava is baking. Boil sugar and water until sugar is melted. Add vanilla and honey. Simmer for about 20 minutes.\n" +
                "\n" +
                "\n" +
                "STEP - 08 :\n" +
                "Remove baklava from the oven and immediately spoon sauce over it. Let cool.\n" +
                "\n" +
                "STEP - 09 :\n" +
                "Serve in cupcake papers. This freezes well. Leave it uncovered as it gets soggy if it is wrapped up.\n" +
                "\n" +
                "STEP - 10 :\n" +
                "Enjoy!","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Arabian/Greek-Baklava.jpg");
       foodsTable("Mutabbaq", "Servings: 4 | Cook Time: 30 minutes\n" +
                       "\n" +
                       "INGREDIENTS :\n" +
                       "\n" +
                       "For the Dough :\n" +
                       "- 1.33 cup all purpose flour\n" +
                       "- 1.33 tablespoon oil\n" +
                       "- 0.33 teaspoon salt\n" +
                       "- 0.67 cup lukewarm water\n" +
                       "\n" +
                       "OR\n" +
                       "\n" +
                       "- Spring roll sheets\n" +
                       "\n" +
                       "For the Minced Meat Filling :\n" +
                       "- 1.33 tablespoon oil\n" +
                       "- 266.67 grams minced beef substitute with chicken mince or mutton mince\n" +
                       "- 0.67 tablespoon ginger garlic paste\n" +
                       "- 0.67 teaspoon black pepper\n" +
                       "- 0.67 teaspoon salt or to taste\n" +
                       "- 0.67 teaspoon cumin powder\n" +
                       "- 0.67 teaspoon red chilli powder\n" +
                       "- 0.33 teaspoon turmeric powder\n" +
                       "- 2.67 eggs\n" +
                       "- 1.33 tomato roughly chopped\n" +
                       "- 0.67 cup green onions chopped\n" +
                       "\n" +
                       "Equipment :\n" +
                       "- Stand mixer\n" +
                       "- Frying pan\n" +
                       "- Mixing bowl\n" +
                       "\n" +
                       "--------------------------\n" +
                       "\n" +
                       "Instructions :\n" +
                       "\n" +
                       "For the Dough (If Using Spring Roll Wrappers Skip This Part):\n" +
                       "\n" +
                       "1. Add flour to the bowl of the stand mixer.\n" +
                       "\n" +
                       "2. Add the oil and salt, and mix.\n" +
                       "\n" +
                       "3. Now slowly start adding the water, about 1 tablespoon at a time. And mix using the dough hook attachment.\n" +
                       "\n" +
                       "4. Continue doing this (it will take about 3-4 minutes of kneading) until the dough starts leaving the sides of the bowl, and forms into a ball. You will not need to add all of the water. If kneading by hand, it will take about 8-9 minutes.\n" +
                       "\n" +
                       "5. If the dough is too sticky, add about 1/2 tablespoon of flour.\n" +
                       "\n" +
                       "6. The dough should be smooth and soft, but not sticky.\n" +
                       "\n" +
                       "7. Brush with a little bit of oil, cover, and rest for 30 minutes.\n" +
                       "\n" +
                       "For the Minced Meat Filling :\n" +
                       "1. In a frying pan, add the oil and meat.\n" +
                       "\n" +
                       "2. Cook for a minute, and then add the ginger garlic paste and spices.\n" +
                       "\n" +
                       "3. Cook for about 10 minutes or until the minced meat is browned and cooked.\n" +
                       "\n" +
                       "4. Add eggs to a mixing bowl, and add the cooked minced meat.\n" +
                       "\n" +
                       "5. Then add the tomato and green onions, and mix until incorporated.\n" +
                       "\n" +
                       "For Making the Mutabbaq :\n" +
                       "1. Divide the dough into 3 equal balls.\n" +
                       "\n" +
                       "2. Roll one ball into a rectangular shape (doesn't have to be perfectly shaped). The dough needs to be rolled so thin, that you can almost see through it. You can also gently use your fingers to stretch it a bit.\n" +
                       "\n" +
                       "3. Add the filling in a square shape on the rolled out dough.\n" +
                       "\n" +
                       "4. Fold from the sides, and then the bottom to make into a pocket. Make sure all sides are covered, and no filling is exposed.\n" +
                       "\n" +
                       "OR\n" +
                       "\n" +
                       "1. If using spring roll sheets, simply add the minced meat filling, and close from both sides. You will have to use a little bit of water to seal the pockets if using spring roll sheets.\n" +
                       "\n" +
                       "Frying the Mutabbaq :\n" +
                       "1. Heat oil in a frying pan, and add the mutabbaq bottom side down (the side that has the folds) and poke with a toothpick so to help the steam escape. Keep heat level to medium high.\n" +
                       "\n" +
                       "2. Flip side when golden brown, and poke with toothpick again.\n" +
                       "\n" +
                       "3. When both sides are golden brown, brown the edges as well so that the dough cooks through from all sides.\n" +
                       "\n" +
                       "4. Remove from frying pan, and serve immediately.\n" +
                       "\n" +
                       "5. Enjoy!\n" +
                       "\n" +
                       "Notes :\n" +
                       "- Make sure to rest the dough for at least 30 minutes, or make it one night before and keep it in airtight container in the fridge. Take out when making the meat filling.\n" +
                       "- Cook on medium high heat so that the mutabbaq cooks well from the inside and crisps up too.\n" +
                       "- Mutabbaq can be stored in the fridge in an airtight container for up to 1-2 days. To reheat it, place in preheated oven on a baking tray for 15 minutes or so. It will heat up really well, but might not be as crispy as it is when fresh.\n" +
                       "- Green onions tip: I get a big bunch of green onions, and slice them, and then freeze in a ziplock bag. Take them out whenever you need them.\n",
               "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Arabian/mutabbaq.jpg");
        foodsTable("Shish Taouk", "Servings: 4 | Cook Time: 30 minutes\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 1.33 pounds boneless skinless chicken breast cut into large chunks\n" +
                        "- 0.33 cup plain whole milk yogurt\n" +
                        "- 0.17 cup lemon juice\n" +
                        "- 0.17 cup olive oil\n" +
                        "- 4 garlic cloves crushed\n" +
                        "- 0.67 tablespoon tomato paste\n" +
                        "- 0.67 teaspoon paprika\n" +
                        "- 0.5 teaspoon cinnamon\n" +
                        "- 0.33 teaspoon oregano\n" +
                        "- 0.33 teaspoon ground ginger\n" +
                        "- 0.67 teaspoon salt\n" +
                        "- 0.17 teaspoon black pepper\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. In a large bowl, add the ingredients for the marinade (yogurt, lemon juice, olive oil, garlic, tomato paste, all the seasoning and salt/pepper) and whisk to combine.\n" +
                        "\n" +
                        "2. Place the chicken cubes in the same bowl and coat the chicken in the marinade. Cover, and let rest/marinate in the fridge for at least 4 hours.\n" +
                        "\n" +
                        "3. Thread the chicken on skewers right before grilling. Add one wedge of onions to each skewer, if desired.\n" +
                        "\n" +
                        "4. Grill on medium heat for 5-8 minutes per side.\n" +
                        "\n" +
                        "5. Serve with pita bread, lettuce and garlic sauce, if desired.\n" +
                        "\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Arabian/Shish-Tawook.jpg");
        foodsTable("Harira", "\n" +
                        "Servings: 6 | Cook Time: 60 minutes\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- Extra virgin olive oil\n" +
                        "- 1 large yellow onion finely chopped\n" +
                        "- 2 celery stalks chopped\n" +
                        "- 1 carrot peeled and chopped\n" +
                        "- Kosher salt\n" +
                        "- 4 garlic cloves minced\n" +
                        "- 1 ½ teaspoons black pepper\n" +
                        "- 1 ½ teaspoon turmeric\n" +
                        "- 1 teaspoon cumin\n" +
                        "- ½ teaspoon ground ginger\n" +
                        "- ½ teaspoon ground cinnamon\n" +
                        "- ½ teaspoon cayenne\n" +
                        "- 2 14- ounce cans crushed tomatoes\n" +
                        "- 3 tablespoons tomato paste\n" +
                        "- 1 cup packed chopped fresh cilantro\n" +
                        "- 1 cup green lentils, rinsed\n" +
                        "- 1 cup red lentils, rinsed\n" +
                        "- 1 14- ounce can chickpeas\n" +
                        "- 7 cups vegetable or chicken stock, preferably low-sodium\n" +
                        "- ¼ cup long grain rice, rinsed or ¼ cup broken vermicelli\n" +
                        "- Lemon wedges, for serving\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. In a large Dutch Oven, heat 4 tablespoon extra virgin olive oil over medium heat until shimmering. Add the onions, celery, and carrots. Season with kosher salt. Cook for 5 minutes, stirring regularly until softened.\n" +
                        "\n" +
                        "2. Add the garlic and spices and cook for a couple of 1 to 2 minutes, stirring regularly.\n" +
                        "\n" +
                        "3. Add the crushed tomatoes, tomato paste, cilantro, lentils (both green and red), and chickpeas. Add a dash more kosher salt and cook for 5 minutes, stirring.\n" +
                        "\n" +
                        "4. Add the broth and raise the heat. Bring to a boil for 5 minutes, then turn the heat to low. Cover and let simmer for 45 minutes or until the legumes are fully cooked and very tender (check occasionally and plan to add more stock or water. The soup will be thick, but it should not be too thick that you cannot pour it. Make sure to adjust the salt as you add more liquid.)\n" +
                        "\n" +
                        "5. Stir in the rice and cook for another 15 or until the rice is fully cooked.\n" +
                        "\n" +
                        "6. Serve with lemon wedges.\n" +
                        "\n" +
                        "Notes :\n" +
                        "- Homemade harissa paste makes a great addition to flavor this soup. If you have it, stir in 1 to 2 teaspoons in step # \n" +
                        "- Leftover and storage: Once the soup has cooled completely, transfer to tight-lid containers and store in the fridge. If stored properly, it will keep for 3 to 4 days. This soup will get pretty thick as it sits in the fridge, you can add a little water as you warm it through. Warm over medium heat, stirring regularly. \n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Arabian/harira.jpg");
        CatList("Arabian", R.drawable.arabian);

        //----------------------------------------------------

        foodsTable("Pad Thai","Servings: 6 | Cook Time: 30 minutes\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- 8 ounces flat rice noodles\n" +
                "- 3 Tablespoons oil\n" +
                "- 3 cloves garlic , minced\n" +
                "- 8 ounces uncooked shrimp, chicken, or extra-firm tofu , cut into small pieces\n" +
                "- 2 eggs\n" +
                "- 1 cup fresh bean sprouts\n" +
                "- 1 red bell pepper , thinly sliced\n" +
                "- 3 green onions , chopped\n" +
                "- 1/2 cup dry roasted peanuts\n" +
                "- 2 limes\n" +
                "- 1/2 cup Fresh cilantro , chopped\n" +
                "\n" +
                "For the Pad Thai sauce:\n" +
                "- 3 Tablespoons fish sauce\n" +
                "- 1 Tablespoon low-sodium soy sauce\n" +
                "- 5 Tablespoons light brown sugar\n" +
                "- 2 Tablespoons rice vinegar , or Tamarind Paste*\n" +
                "- 1 Tablespoon Sriracha hot sauce , or more, to taste\n" +
                "- 2 Tablespoons creamy peanut butter* (optional)\n" +
                "\n" +
                "Equipment\n" +
                "- oven-safe skillet\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "1. Cook noodles according to package instructions, just until tender.  Rinse under cold water.\n" +
                "\n" +
                "2. Make sauce by combining sauce ingredients in a bowl. Set aside.\n" +
                "\n" +
                "3. Stir Fry:: Heat 1½ tablespoons of oil in a large saucepan or wok over medium-high heat. Add the shrimp, chicken or tofu, garlic and bell pepper. The shrimp will cook quickly, about 1-2 minutes on each side, or until pink. If using chicken, cook until just cooked through, about 3-4 minutes, flipping only once.\n" +
                "\n" +
                "4. Push everything to the side of the pan. Add a little more oil and add the beaten eggs. Scramble the eggs, breaking them into small pieces with a spatula as they cook.\n" +
                "\n" +
                "5. Add noodles, sauce, bean sprouts and peanuts to the pan (reserving some peanuts for topping at the end). Toss everything to combine.\n" +
                "\n" +
                "6. Garnish the top with green onions, extra peanuts, cilantro and lime wedges. Serve immediately!\n" +
                "\n" +
                "7. Store leftovers in the fridge and enjoy within 2-3 days.\n" +
                "\n" +
                "Notes :\n" +
                "- Make Ahead Instructions: Cut your protein, and chop veggies ahead of time. Stir sauce ingredients together and refrigerate until ready to use.\n" +
                "- Tamarind Paste: Substitute 2 Tablespoons Tamarind paste in place of the vinegar, for a more authentic sauce. You can buy tamarind online, or at an international foods market. \n" +
                "- Vegan or Vegetarian: Leave out the egg. Use tofu, and substitute the fish sauce for more soy sauce.\n" +
                "- Peanut Butter: In my recipe, I add a big scoop of peanut butter to the sauce because I think it gives the whole dish an added creaminess and boost of flavor.\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Thai/pad_thai.jpg");
        foodsTable("Tom Yum Soup (Thai soup)","Servings: 2 | Cook Time: 35 minutes\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 300g / 10oz whole prawns / shrimp with heads and shells on (Note 7)\n" +
                        "BROTH:\n" +
                        "- 3 cup (750 ml) water\n" +
                        "- 1/2 cup (125 ml) chicken stock/broth , low sodium\n" +
                        "- 2 stalks of lemongrass , outer layers peeled(Note 1)\n" +
                        "- 1.5 cm / 3/5\" piece of galangal , cut into 4 slices (Note 2)\n" +
                        "- 5 kaffir lime leaves , torn roughly (Note 3)\n" +
                        "- 2 Thai or birdseye chillies (Note 4)\n" +
                        "- 3 garlic cloves\n" +
                        "\n" +
                        "SOUP ADD INS:\n" +
                        "- 120g / 4oz oyster mushrooms\n" +
                        "- 1 roma tomato , cut into wedges\n" +
                        "- 1/2 white onion (medium sized), cut into wedges about 1 cm thick\n" +
                        "- 1 tsp sugar\n" +
                        "- 3 tbsp fish sauce (Note 5)\n" +
                        "- 3 tbsp lime juice\n" +
                        "- Coriander/cilantro , for garnish\n" +
                        "\n" +
                        "CREAMY TOM YUM OPTION:\n" +
                        "- 1 1/2 tbsp Thai roasted chili sauce (Nam Prik Pa, Note 6)\n" +
                        "- 1/3 cup (75 ml) evaporated milk\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "BROTH:\n" +
                        "1. Peel the prawns. Place heads and shell in pot, reserve meat.\n" +
                        "\n" +
                        "2. Use a meat mallet or similar to bash the garlic, chilli and lemongrass so they burst open to release flavour. Add into pot.\n" +
                        "\n" +
                        "3. Crush kaffir lime leaves with your hands. Add into pot.\n" +
                        "\n" +
                        "4. Add galangal, stock and water. Bring to simmer on high heat, cover, then reduce to medium and simmer for 10 minutes.\n" +
                        "\n" +
                        "5. Strain the broth, discard the prawn shells etc, then return broth into same pot over low heat.\n" +
                        "\n" +
                        "FINISH SOUP:\n" +
                        "1. Add onions and mushrooms, simmer 3 minutes. Add tomatoes, simmer for 1 minute.\n" +
                        "\n" +
                        "2. Add prawns, simmer 2 minutes or until just cooked.\n" +
                        "\n" +
                        "3. Stir in sugar and fish sauce, simmer for 1 minute.\n" +
                        "\n" +
                        "4. Add lime juice, then taste. Adjust sweet (sugar), salt (fish sauce) and sour (lime) to your taste (trust me, you'll know when you like it!).\n" +
                        "\n" +
                        "5. Ladle into bowls and serve with fresh coriander and fresh chilli! This is the CLEAR version of Tom Yum.\n" +
                        "\n" +
                        "CREAMY TOM YUM:\n" +
                        "1. When you add sugar, also add Thai Chilli Paste and evaporated milk.\n" +
                        "2. Then continue with recipe!\n" +
                        "\n" +
                        "Recipe Notes:\n" +
                        "1. Lemongrass - To prepare, cut in half, peel the reedy green shell to reveal the softer white part on the bottom half of the lemongrass. If lemongrass is hard to come by, you can use PASTE: stir in 1 tbsp.\n" +
                        "2. Galangal is like ginger but it has a more sour and peppery flavour. If you can't find it, just substitute ginger and a grind of black pepper.\n" +
                        "3. Kaffir Lime Leaves are the leaves of a kaffir lime tree. It's used to add earthy citrus flavours into Asian food. Sold at large grocery stores (Coles, Woolies, Harris) and Asian stores. Dried is an ok substitute (same amount), but I really urge you to try to find fresh if you can because it adds that \"something-something\" that really makes this \"restaurant quality\". Freezes 100% perfectly, I always have a stash!\n" +
                        "4. Chilli - This soup is not that spicy but has a mild hum to it!\n" +
                        "5. Fish Sauce - I'm afraid this is key to getting enough flavour in the broth so I can't offer a sub here!\n" +
                        "6. Thai roasted Chilli Paste - you'll need to go to a Thai grocery store for this. If you can't get to one, use another Asian Chilli Paste and some chilli oil to achieve a similar flavour and effect. Sambal Oelak + chilli oil is an excellent fall back.\n" +
                        "7. SHORTCUT FROZEN PRAWN/SHRIMP VERSION: I wanted to make a faster version made using pre-peeled frozen prawns. Even I was astonished how well it came out! Here's how to make it:\n" +
                        "Skip prawn/shrimp shells and head in the broth. Instead, add 1.5 tsp shrimped paste into the broth. Proceed with recipe.\n" +
                        "Use 200g/7oz frozen peeled prawns (this is more than the weight of peeled whole prawns) and add them in step 7. The resulting soup is extremely good, quite similar to making the broth using the prawn shells!\n" +
                        "8. Storing - leftover soup can be kept for 2 days in the fridge then gently reheat in microwave without prawns/shrimp and add them in later (so you don't accidentally overcook them). \n" +
                        "Freezing - broth freezes 100% perfectly. For best results, follow recipe to strain, then return into pot. Gently cook shrimp/prawns than remove. Add fish sauce and sugar. Allow to cool separately, return shrimp into broth and freeze. Add mushrooms and tomato once soup is reheated, as well as lime (best to add these fresh).\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Thai/Tom-Yum-creamy-version_6.jpg");
        foodsTable("Green Curry","Servings: 4 | Cook Time: 35 minutes\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "CURRY – USE ONE:\n" +
                        "- 4 – 6 tbsp Thai Green Curry Paste (Maesri best) OR (Note 1)\n" +
                        "- 1 quantity homemade green curry paste (Note 1)\n" +
                        "\n" +
                        "EXTRAS – FOR JAR CURRY PASTE (NOTE 2):\n" +
                        "- 2 large garlic cloves , minced\n" +
                        "- 2 tsp fresh ginger , finely grated\n" +
                        "- 1 tbsp lemongrass paste (Note 2)\n" +
                        "\n" +
                        "GREEN CURRY:\n" +
                        "- 2 tbsp vegetable oil\n" +
                        "- 1 cup (250ml) chicken or vegetable broth, low sodium\n" +
                        "- 400 g/14oz coconut milk , full fat (Note 4)\n" +
                        "- 1 – 3 tsp fish sauce *\n" +
                        "- 1 – 3 tsp white sugar *\n" +
                        "- 1/8 tsp salt *\n" +
                        "- 6 kaffir lime leaves , torn in half (Note 5)\n" +
                        "- 350 g/12 oz chicken thigh , skinless boneless, sliced (Note 6)\n" +
                        "- 2 Japanese eggplants, , small, 1cm / 2/5″ slices (Note 7)\n" +
                        "- 1 1/2 cups snow peas , small, trimmed\n" +
                        "- 16 Thai basil leaves (Note 8)\n" +
                        "- Juice of 1/2 lime , to taste\n" +
                        "\n" +
                        "GARNISHES:\n" +
                        "- Crispy fried Asian shallots , high recommended (Note 9)\n" +
                        "- Thai basil or cilantro/coriander , recommended\n" +
                        "- Green or red chillies slices , optional\n" +
                        "- Steamed jasmine rice\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Heat oil in a heavy based skillet or pot over medium high heat.\n" +
                        "\n" +
                        "2. Add curry paste (and garlic, ginger and lemongrass Extras, if using) and cook for 2 to 3 minutes until it mostly “dries out” – see video. Don’t breath in the fumes!!\n" +
                        "\n" +
                        "3. Add chicken broth and coconut milk, mix to dissolve paste.\n" +
                        "\n" +
                        "4. Curry in a jar seasonings: Add 1 tsp fish sauce, 1 tsp sugar, no salt.\n" +
                        "\n" +
                        "5. Homemade curry paste seasonings: Add 3 tsp fish sauce, 3 tsp sugar, 1/8 tsp salt.\n" +
                        "\n" +
                        "6. Add kaffir lime leaves. Mix then bring to simmer.\n" +
                        "\n" +
                        "7. Add chicken, stir then lower heat to medium so it’s bubbling gently. Cook 7 minutes.\n" +
                        "\n" +
                        "8. Add eggplants, cook 5 minutes until soft.\n" +
                        "\n" +
                        "9. Taste sauce. Add fish sauce or salt for more saltiness, sugar for sweetness.\n" +
                        "\n" +
                        "10.Add snow peas, cook 2 minutes until a bit softened, then stir through basil and lime juice. Sauce should have reduced but will still be a be on the thin side, not thick – that’s how it’s should be. DO NOT keep simmering – sauce will darken.\n" +
                        "\n" +
                        "11. Serve curry over jasmine rice with garnishes of choice.\n" +
                        "\n" +
                        "Recipe Notes:\n" +
                        "* Because store bought curry paste is more seasoned than homemade, if using curry from a jar then use less of these, as directed in steps 4 and 5.\n" +
                        "1. Curry Paste – I use a whole can of Maesri green curry paste (114g/4 oz) which I think is the best (by a long shot) and also happens to be the cheapest (~$1.20). Sold at Woolies, Coles, Harris and Asian grocery stores (in Australia) and here it is on Amazon US.\n" +
                        "Other brands are fine to use too but the ones I have tried, the flavour isn’t as good and they were too sweet.\n" +
                        "Green curry IS spicy so if using a jar paste, it’s hard to reduce spiciness without affecting flavour, but you can (usually) reduce down to 4 tbsp and still have decent green curry flavour (every brand differs!).\n" +
                        "Homemade green curry paste – the volume of curry paste is considerably greater (curry in a jar is concentrated). See the curry paste recipe for adjusting spiciness – can reduce to barely spicy without losing flavour at all.\n" +
                        "2. Extras – these are to pimp up store bought curry in a jar and make it taste fresher. Only use if using curry paste from a jar or can.\n" +
                        "3. Lemongrass paste – convenience tubes of cold pressed lemongrass paste, the next best thing to peeling / finely chopping fresh lemongrass! Can sub with 2 tsp finely minced fresh lemongrass.\n" +
                        "4. Coconut milk – if you use low fat, you will lose coconut flavour because the flavour is in the fat! Also, Ayam is the best brand in Australia – the creamiest and purest. Other brands don’t have the same creamy mouth feel. You can also use coconut cream if you want a richer, thicker sauce (green curry is normally a thinner sauce, see video).\n" +
                        "5. Kaffir Lime Leaves – find them in major supermarkets in Australia and Asian grocery stores. They freeze super well for months and months. Adds earthy citrus flavour (not sour). Best sub is to use a lemongrass – smash open the white part (where all the flavour is) then use in place of kaffir lime leaves. Last resort is to peel some strips of lime skin (green part only, avoid white part) and pop that in (I’d use the peel of 1 whole lime. Make them big enough so you can pick them out later.\n" +
                        "6. Chicken – thigh is best because it’ll stay juicy with the prescribed simmering time. If using breast, let the sauce simmer for 5 minutes before adding it.\n" +
                        "7. Japanese eggplants – shaped like a cucumber. Excellent sponge to such up curry sauce. Slice into rounds or slight diagonal. Sub with small eggplants, ideally want skin on each piece which holds it together because it gets very soft. Non eggplant sub: zucchini/courgettes\n" +
                        "8. Thai basil leaves – tastes like normal basil with a more pronounced aniseed flavour. Sold at major supermarkets in Australia and Asian grocery stores. Last resort, sub with normal basil.\n" +
                        "9. Crispy Fried Asian Shallots – sold at large supermarkets in Australia and Asian grocery stores (MUCH cheaper!). Common garnish at Asian restaurants. Deep fried sliced shallots, crispy and salty. Terrific texture and flavour finish for everything Asian from soups to noodles, stir fries, curries, salads. I use extensively even in non Asian dishes.\n" +
                        "10. Other ingredients: Use any proteins / vegetables you want as long as they are suited to being simmered and the cook time. The sauce needs to be simmered for 13 – 15 min to get the right flavour and thickness. Some suggestions:\n" +
                        "* Vegetarian – Asian eggplant, green beans, zucchini (pictured in post). Other vegetables that go great: broccoli, cauliflower, asparagus, carrots, sweet or normal potato, pumpkin, mushrooms (cook to soft, great sponge!)\n" +
                        "* Prawns / shrimp or fish pieces instead of chicken – add towards end, 3 to 5 min cook time\n" +
                        "* Beef or pork – Use a quick cooking cut, cut into strips or cubes. I sear beef and pork first before adding into curry sauces, the flavour is better. Use any quick cooking cut, sprinkle with salt and pepper, sear to brown outside but leave inside uncooked. Then add into sauce just to finish cooking through. \n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Thai/Thai-Green-Curry_5.jpg");
        foodsTable("Red Curry","Servings: 4 | Cook Time: 25 minutes\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "RED CURRY PASTE – CHOOSE ONE:\n" +
                        "- 5 – 6 tbsp Thai Red Curry Paste (store bought, Maesri best) (Note 1)\n" +
                        "- 1 quantity homemade Thai Red Curry Paste\n" +
                        "\n" +
                        "EXTRAS – ONLY FOR JAR CURRY PASTE (NOTE 2)\n" +
                        "- 2 large garlic cloves , minced\n" +
                        "- 2 tsp fresh ginger , finely grated\n" +
                        "- 1 tbsp lemongrass paste or finely chopped fresh (Note 3)\n" +
                        "\n" +
                        "THAI RED CURRY :\n" +
                        "- 3 tbsp vegetable oil (or canola or peanut)\n" +
                        "- 1 cup (250 ml) chicken broth/stock , low sodium\n" +
                        "- 400 ml / 14 oz coconut milk (full fat!)\n" +
                        "- 6 kaffir lime leaves (Note 4)\n" +
                        "- 1 tbsp sugar (white, brown or palm)\n" +
                        "- 2 tsp fish sauce , plus more to taste\n" +
                        "- 350g / 12 oz chicken thighs (boneless and skinless), cut into 0.75 / 1/3″ thick slices (Note 5)\n" +
                        "- 150g / 5 oz pumpkin or butternut squash, cut into 1.5cm / 3/5\" cubes (~1 heaped cup)\n" +
                        "- 120g / 4oz green beans , trimmed and cut into 5cm/2″ pieces\n" +
                        "- 12 Thai basil leaves (Note 6)\n" +
                        "\n" +
                        "GARNISHES (OPTIONAL) & SERVING:\n" +
                        "- Fresh red chilli slices (small chilli – spicy, large = less spicy)\n" +
                        "- Fresh coriander / cilantro leaves\n" +
                        "- Steamed jasmine rice\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Heat oil in a large heavy based skillet over medium high heat.\n" +
                        "\n" +
                        "2. Add curry paste and Extras (if using jar paste) and cook for about 2 minutes so it “dries out” (See video)\n" +
                        "\n" +
                        "3. Add chicken broth and stir to dissolve paste. Simmer rapidly for 3 minutes or until liquid reduces by half.\n" +
                        "\n" +
                        "4. Add coconut milk, lime leaves, sugar and fish sauce. Stir, then add chicken.\n" +
                        "\n" +
                        "5. Spread chicken out, bring to simmer, then turn heat down to medium. Simmer for about 8- 10 minutes or until Sauce reduces, the chicken is cooked and the sauce is almost at the thickness you want.\n" +
                        "\n" +
                        "6. Do a taste test. Add more fish sauce (or even shrimp paste) to add more saltiness, sugar for sweetness.\n" +
                        "\n" +
                        "7.Add pumpkin and beans, stir. Cook for 3 minutes or until pumpkin is just cooked through and Sauce is thickened – see video for Sauce thickness.\n" +
                        "\n" +
                        "8. Remove from heat. Stir through a handful of Thai basil leaves.\n" +
                        "\n" +
                        "9. Serve over jasmine rice, garnished with fresh red chilli slices and fresh coriander/cilantro leaves, if desired.\n" +
                        "\n" +
                        "Recipe Notes:\n" +
                        "1. Curry paste – if using store bought, try to get Maesri brand if you can, it’s the best (small can, very cheap). Sold at major grocery stores (Woolies, Coles) or Asian stores. Otherwise, use your favourite.\n" +
                        "Use 5 tbsp if you are unsure about spiciness, or 6 tbsp (or the whole can!) if you are sure you can handle it!\n" +
                        "Note: curry paste in jars has a more concentrated flavour than fresh homemade paste so you need less. The video shows homemade paste.\n" +
                        "\n" +
                        "2. Extras – these are to freshen up store bought curry paste. Not required if using homemade.\n" +
                        "\n" +
                        "3. Lemongrass paste – convenience tubes of cold pressed lemongrass paste, the next best thing to peeling / finely chopping fresh lemongrass! Can sub with 2 tsp finely minced fresh lemongrass.\n" +
                        "\n" +
                        "4. Kaffir Lime Leaves are the leaves of a kaffir lime tree. It’s used to add earthy citrus flavours into Asian food. Sold at large grocery stores and Asian stores. Dried is an ok substitute (same amount), but I really urge you to try to find fresh if you can because it adds that “something-something” that really makes this “restaurant quality”.\n" +
                        "\n" +
                        "5. Chicken – Thigh is best for this recipe because it’s nice and juicy. But breast and tenderloin is fine too.\n" +
                        "\n" +
                        "6. Thai Basil looks like normal basil but has pointier leaves and a purplish tinge. It tastes like basil + aniseed. Not the end of the world if you can’t find it – ordinary basil will be an adequate substituted but only use a small handful.\n" +
                        "\n" +
                        "7. General recipe notes:\n" +
                        "Spiciness: Thai Red Curry is not supposed to be crazy spicy but it has a nice tingle to it. \n" +
                        "Sauce thickness  varies drastically between restaurants – at some it is almost watery, at others it is really thick and seems to be made with coconut cream. I like mine in between – a sauce that is pourable but with a gravy like consistency. I am not a fan of very sweet Red Curry, but if you are, just add more sugar.\n" +
                        "Consistency: Thai red curry sauce doesn’t look completely smooth, it looks a bit split because of the oil and that’s the way it is supposed to be. \n" +
                        "Stuff in it: There are no hard and fast rules about what goes into a Thai Red Curry. You’ll find Thai eggplant in curries at very authentic Thai restaurants but to be honest, I am not a huge fan of them – they are like tiny eggplants and kind of hard (also not easy to find in shops). I’d say that the two most common vegetables I’ve noticed are pumpkin and green beans or snake beans. While pumpkin may not sound “Thai”, don’t dismiss it, it is spectacular in red curry for both the texture, the sweetness and also because it soaks up the sauce.\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Thai/Thai-Red-Curry-Chicken-1.jpg");
        foodsTable("Massaman Curry","Servings: 4 | Cook Time: 2 hrs and 20 mins\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "SPICE PASTE:\n" +
                        "- 1 lemongrass (Note 1)\n" +
                        "- 6 dried red Asian chillis (not Thai! Note 2)\n" +
                        "- 4 eschallots , peeled (Note 3)\n" +
                        "- 5 cloves garlic , unpeeled\n" +
                        "- 3 cm / 2.25″ galangal piece , peeled, cut into 3/4 cm / 1/2″ slices (Note 4)\n" +
                        "- 4 – 6 tbsp water\n" +
                        "\n" +
                        "SPICE PASTE DRIED SPICES:\n" +
                        "- 1/2 tsp ground cloves\n" +
                        "- 3/4 tsp cumin\n" +
                        "- 1/8 tsp ground nutmeg\n" +
                        "- 3/4 tsp coriander\n" +
                        "- 1/2 tsp cardamom\n" +
                        "- 1/2 tsp cinnamon\n" +
                        "\n" +
                        "BEEF:\n" +
                        "- 700 g / 1.4lb beef chuck , cut into 4cm / 2.5″ cubes (Note 5)\n" +
                        "- 500 ml / 2 cups beef broth , low sodium\n" +
                        "- 2 bay leaves\n" +
                        "\n" +
                        "CURRY SAUCE:\n" +
                        "- 1/4 cup / 65 ml vegetable oil\n" +
                        "- 400 ml / 14 oz coconut milk (full fat, 1 can)\n" +
                        "- 1 cinnamon quill\n" +
                        "- 1 star anise\n" +
                        "- 1 tsp tamarind paste/puree (Note 6)\n" +
                        "- 1 tbsp fish sauce\n" +
                        "- 1 tbsp white sugar\n" +
                        "- 2 medium-small potatoes , peeled and cut into 2.5cm / 1″ pieces\n" +
                        "\n" +
                        "GARNISH & SERVING:\n" +
                        "- 3 tbsp peanuts , roughly chopped\n" +
                        "- Finely sliced red chilli (optional)\n" +
                        "- Asian fried shallots (optional, Note 7)\n" +
                        "- Steamed jasmine rice\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "LEMONGRASS (SEE VIDEO):\n" +
                        "1. Remove reedy outer layers and trim lemongrass per Note 1. \n" +
                        "\n" +
                        "2. Reserve all the trimmings (for beef). Finely chop the white part (for paste.\n" +
                        "\n" +
                        "BEEF:\n" +
                        "1. Place Beef ingredients in a medium saucepan. Liquid should almost cover beef but not completely – if not, add water.\n" +
                        "\n" +
                        "2. Add lemongrass trimmings.\n" +
                        "\n" +
                        "3. Bring to boil over high heat, then reduce heat and simmer gently for 1.5 – 2 hours until beef is fork tender.\n" +
                        "\n" +
                        "4. Remove beef. If there’s much more than 1.5 cups liquid, simmer to reduce. Set liquid aside.\n" +
                        "\n" +
                        "CHAR AROMATICS (CHAR = FLAVOUR!):\n" +
                        "1. Place heavy based skillet over high heat until smoking (no oil).\n" +
                        "\n" +
                        "2. Add eschalot, garlic and galangal in skillet. Get a nice char on them, then remove (~1.5 minutes).\n" +
                        "\n" +
                        "3. Add dried chillies into skillet, char 10 seconds or so on each side until charred, then remove.\n" +
                        "\n" +
                        "4. Once cool enough to handle: Grate galangal. Peel garlic. Break chillies in half, shake out seeds and discard.\n" +
                        "\n" +
                        "SPICE PASTE DRIED SPICES:\n" +
                        "1. Wipe the skillet used above or use a clean one. Heat on medium heat, add Spice Paste Dried Spices. Toast for 30 seconds or until they start to smell fragrant – do not let them burn. Immediately transfer into bowl.\n" +
                        "\n" +
                        "CURRY PASTE:\n" +
                        "1. Place chillies in food processor. (Note 8) Blitz until finely chopped.\n" +
                        "\n" +
                        "2. Add galangal, finely chopped lemongrass, the toasted Spice Paste Dried Spices, and remaining Spice Paste ingredients, starting with 4 tbsp water. Blitz until smooth – add more water if required.\n" +
                        "\n" +
                        "CURRY SAUCE:\n" +
                        "1. Place oil in a pot or large skillet over medium high heat. Add curry paste and cook for 3 minutes until the liquid has cooked out and it’s thick and fragrant.\n" +
                        "\n" +
                        "2. Add coconut milk, stir to incorporate.\n" +
                        "\n" +
                        "3. Add cinnamon, star anise and reserved beef braising liquid. Reduce heat to medium and simmer for 3 minutes.\n" +
                        "\n" +
                        "4. Stir in fish sauce, tamarind and sugar, stir.\n" +
                        "\n" +
                        "5. Add potatoes and cook for 7 minutes or until potatoes are tender, turning as required.\n" +
                        "\n" +
                        "6. Add beef and simmer for 2 minutes or until sauce has reduced and thickened.\n" +
                        "\n" +
                        "7. Adjust: saltiness with fish sauce, sour with tamarind and sweet with sugar. The taste should be sweet, salty and sour, with more emphasis on the sweet and sour notes. Top up with a little water if the curry seems too thick\n" +
                        "\n" +
                        "8. Serve over jasmine rice, garnished with peanuts (essential!) plus optional crispy Asian shallots and fresh chillies.\n" +
                        "\n" +
                        "\n" +
                        "Recipe Notes:\n" +
                        "STORE BOUGHT CURRY PASTE directions: Use Maesri brand if you can, it’s the cheapest and best by far. Use the whole can – 114g/4oz – or the same amount of other brands. \n" +
                        "Follow Beef steps to cook beef and make broth;\n" +
                        "Skip all curry paste making steps;\n" +
                        "Under Curry Sauce steps, use store bought paste instead of homemade PLUS 2 garlic cloves minced, 2 tsp minced ginger plus 1 tbsp lemongrass (paste OR finely grated fresh, white part only).\n" +
                        "Cook it off for 3 minutes per recipe, proceed with recipe as written.\n" +
                        "1. Lemongrass preparation: Cut lemongrass to leave you with just the bottom 8 cm / 3″. Peel off the reedy outer layers, then trim the tough base off, leaving you with a pale green / white stem. This part will be used for the paste. The trimmings are used in the beef braising broth.\n" +
                        "2. Chillies – This curry is not supposed to be spicy, just a warm hum. This recipe is made with the generic Asian dried chillies purchased from Asian grocery stores which are usually not that spicy. It is not made with Thai Chillies which are considerably spicier (cut down to 2 or 3).\n" +
                        "The spiciness of chillies (dried and fresh) is like playing roulette – at different times of the year, they go up and down. The only way to really control how spicy your curry will be is to taste the chilli. If it’s not that spicy, proceed with the recipe. \n" +
                        "But if it’s spicy, then feel free to dial it back – 3 is a good starting point, 2 if you are really concerned.\n" +
                        "You can substituted with other dried red chillies but always check spiciness first!\n" +
                        "3. Eschalots = French onions = those small red / purple baby onions. Can sub with 1 red onion, peeled and quartered.\n" +
                        "4. Galangal – Looks like ginger but with a red skin and harder to cut. Tastes like citrusy/piney ginger. Found at everyday supermarkets in Australia. If you really can’t find it, sub with ginger + zest of 1 lime.\n" +
                        "5. Beef – Massaman is supposed to be made with large pieces of meat, rather than small bite size pieces, so the meat needs to be slow cooked to become tender and absorbs the flavour of the braising liquid. Can be substituted with brisket but make sure you trim off the thick layer of fat, otherwise the sauce ends up too greasy. Gravy beef is also suitable, as long as you can find large pieces.\n" +
                        "OTHER PROTEINS: Pork, goat, rabbit, bone in chicken pieces, lamb. Cut into large pieces and just simmer until fork tender, adjusting liquid level with water if required to end up with about 1 1/2 cups liquid at the end. I’ve had Massaman Lamb Shank at a restaurant and it was EPIC!\n" +
                        "6. Tamarind – Sour paste used in South East Asian cooking. Sold in jars at supermarkets in Australia in the Asian section. Can substitute with lime juice (2 tsp) or vinegar (1 tsp).\n" +
                        "7. Asian Fried Shallots – Little pops of salty, fried, crispy goodness I’m addicted to! Sold in the Asian aisle of supermarkets in Australia but better value at Asian stores!\n" +
                        "8. Blitzing – You need a decent food processor for any curry paste, to ensure it’s powerful enough to blitz the ingredients into a smooth paste.\n" +
                        "9. Storage: terrific served fresh and also Keeps well in the fridge for 3 days. I imagine it freezes well – just give the sauce a good stir to smooth it out.\n" +
                        "10. Recipe source: Another RecipeTin Family effort! We find many Thai restaurants tend to dumb down the spices and make the sauce too sweet. So we looked to more authentic recipes from David Thompson (the man!) and Sujet Saenkham of Spice I Am fame for inspiration on how Massaman curry really should be done. After three or four cracks at it, we love we’ve ended up and hope you will love our Massaman curry as much as we do!\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Thai/Massaman-Curry_3.jpg");
        foodsTable("Tom Kha Gai (Coconut Chicken Soup)","Servings: 4 | Cook Time: 1 hr\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- ⅔ tablespoon coconut oil\n" +
                "- half of one onion thinly sliced\n" +
                "- 1 ⅓ cloves garlic chopped\n" +
                "- half of one red jalapeno pepper sliced; or 1-3 Thai chiles, halved\n" +
                "- 2 ¼-inch slices galangal or ginger\n" +
                "- ⅔ lemongrass stalk pounded with the side of a knife and cut into 2-inch long pieces\n" +
                "- 1 ⅓ teaspoons red Thai curry paste\n" +
                "- 2 ⅔ cups chicken broth see Notes if vegan or on Whole30\n" +
                "- 2 ⅔ cups canned full-fat coconut cream unsweetened, or full-fat unsweetened coconut milk; see Notes\n" +
                "- 1 ⅓ medium chicken breasts cut into bite-sized pieces, approximately 1 pound\n" +
                "- 5 ⅓ ounces white mushroom caps sliced\n" +
                "- ⅔-1 ⅓ tablespoons coconut sugar see Notes for Whole30 option\n" +
                "- 1 – 1 ⅓ tablespoons fish sauce plus more to taste, see Notes if on Whole30 or vegan\n" +
                "- 1 ⅓-2 tablespoons fresh lime juice\n" +
                "- 1 ⅓-2 green onions sliced thin\n" +
                "- fresh cilantro chopped, for garnish\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "1. In a medium pot, heat the coconut oil over medium heat. Add the onion, garlic, jalapeno or chile, galangal or ginger, lemongrass, and red curry paste and cook, stirring frequently, for 5 minutes, or until onions are softened. Add chicken broth and bring to a boil. Reduce heat and simmer uncovered for 30 minutes.\n" +
                "\n" +
                "2. Strain out the aromatics (the garlic, onions, lemongrass, and ginger) and discard. Add in coconut cream or milk, chicken breast (or tofu or shrimp), and mushrooms. Simmer until chicken breast pieces are just cooked through, then add fish sauce, coconut aminos (or coconut sugar), and lime juice, plus more of each to taste. \n" +
                "\n" +
                "3. Cook 2 minutes, then ladle into serving bowls and top with sliced green onions and fresh cilantro.\n" +
                "\n" +
                "\n" +
                "Notes\n" +
                "- Be sure to use coconut cream or coconut milk. Coco lopez and coconut creamer are not the same as coconut cream/coconut milk and will not work in this recipe.\n" +
                "- To use shrimp, simply stir in 1 pound of raw shrimp instead of chicken. Simmer until just cooked through, pink, and no longer translucent. \n" +
                "- Make it Whole30: Use compliant chicken broth. Use 2 tablespoons coconut aminos instead of coconut sugar. Use Red Boat fish sauce – this is the only fish sauce I’ve found to be compliant.\n" +
                "- Make it Vegan/Vegetarian: Use vegetable stock, preferably an Asian variety. Use a 1-pound block of firm or extra firm tofu (regular or silken) cut into bite-sized cubes. For vegan, use soy sauce (to taste) instead of fish sauce.\n" +
                "\n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Thai/best-tom-kha-soup-3.jpg");
       foodsTable("Pad See Ew","Servings: 4 | Cook Time: 18 mins\n" +
                       "\n" +
                       "INGREDIENTS :\n" +
                       "\n" +
                       "NOODLES\n" +
                       "- 400g / 14 oz dried wide rice stick noodles , or 15 oz / 450g fresh wide flat rice noodles (Sen Yai) (Note 1)\n" +
                       "\n" +
                       "SAUCE :\n" +
                       "- 4 tsp dark soy sauce (Note 2)\n" +
                       "- 3 tbsp oyster sauce\n" +
                       "- 2 tbsp light soy sauce (or all purpose, Note 3)\n" +
                       "- 4 tsp white vinegar (plain white vinegar)\n" +
                       "- 4 tsp sugar (any type)\n" +
                       "\n" +
                       "STIR FRY:\n" +
                       "- 6 tbsp peanut or vegetable oil , separated\n" +
                       "- 4 cloves garlic cloves, very finely chopped\n" +
                       "- 2 cup / 300g / 10oz chicken thighs (boneless, skinless), sliced (Note 4)\n" +
                       "- 2 large egg\n" +
                       "- 8 stems Chinese broccoli (Note 5)\n" +
                       "\n" +
                       "--------------------------\n" +
                       "\n" +
                       "Instructions :\n" +
                       "PREPARATION:\n" +
                       "1. Chinese Broccoli – trim ends, cut into 7.5cm/3\" pieces. Separate leaves from stems. Cut thick stems in half vertically so they're no wider than 0.8cm / 0.3\" thick.\n" +
                       "\n" +
                       "2. Noodles – Prepare according to packet directions and drain. Time it so they’re cooked just before using – do not leave cooked rice noodles lying around, they break in the wok.\n" +
                       "\n" +
                       "3. Sauce – Mix ingredients until sugar dissolves.\n" +
                       "\n" +
                       "COOKING:\n" +
                       "1. Heat oil: Heat 1 tbsp oil in a very large heavy based skillet or wok over high heat.\n" +
                       "\n" +
                       "2. Cook garlic and chicken: Add garlic, cook 15 seconds. Add chicken, cook until it mostly changes from pink to white.\n" +
                       "\n" +
                       "3. Chinese broccoli STEMS: Add Chinese broccoli stems, cook until chicken is almost cooked through.\n" +
                       "\n" +
                       "4. Chinese broccoli LEAVES: Add Chinese broccoli leaves, cook until just wilted.\n" +
                       "\n" +
                       "5. Scramble egg: Push everything to one side, crack egg in and scramble.\n" +
                       "\n" +
                       "6. REMOVE chicken from wok: Remove everything in the wok onto a plate (scrape wok clean).\n" +
                       "\n" +
                       "7. Caramelise noodles: Return wok to stove, heat 2 tbsp oil over high heat until it starts smoking (HOT is key!). Add noodles and Sauce. Toss as few times as possible to disperse Sauce and make edges of noodles caramelise – about 1 to 1 1/2 minutes.\n" +
                       "\n" +
                       "8. Add chicken back in: Quickly add chicken and veg back in, and toss to disperse. Serve immediately!\n" +
                       "\n" +
                       "\n" +
                       "Recipe Notes:\n" +
                       "1. Noodles – Pad See Ew is traditionally made with Sen Yai fresh rice noodles which are wide, flat rice noodles. These are hard to handle and quite difficult to find, even at Asian grocery stores – you need to go to a Thai grocery store.\n" +
                       "Easiest to use wide, dried rice stick noodles. I use Pad Thai noodles, the widest you can find at supermarkets.\n" +
                       "Fresh rice noodle – Feel free to use, follow the directions in Char Kway Teow to prepare the rice noodles for cooking.\n" +
                       "Other noodles – can be made with other noodles, fresh or dried, rice or egg noodles. However, I do not recommend using vermicelli as it is too thin for the strong flavours of the sauce.\n" +
                       "2. Dark soy sauce has a stronger flavour than ordinary and light soy sauce, and stains the noodles brown. Can sub with ordinary soy, but noodles won’t be as dark and flavour will be slightly less strong.\n" +
                       "3. Light soy sauce – Do not substitute with more dark soy sauce, the flavour is too intense. More on different types of soy sauces here.\n" +
                       "4. Chicken – You can substitute the chicken with other proteins suitable for stir frying, even tofu or prawns.\n" +
                       "5. Chinese Broccoli (Gai Lan, kai lan)If you can’t find Chinese broccoli, you can substitute with other leafy Chinese vegetables such as pak choy or bok choy. Or use broccolini – cut them in half lengthwise.\n",
               "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Thai/Pad-See-Ew-Thai-Noodles_4.jpg");
        foodsTable("Mango Sticky Rice","Servings: 6 | Cook Time: 1 hr\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- 1½ cups glutinous (sweet) rice\n" +
                "- 1⅓ cups well-stirred canned unsweetened coconut milk\n" +
                "- ⅓ cup plus 3 tablespoons sugar\n" +
                "- ¼ teaspoon salt\n" +
                "- 1 tablespoon sesame seeds, toasted lightly\n" +
                "- 1 large mango, peeled, pitted, and cut into thin slices (at least 24)\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "Step 1\n" +
                "In a bowl wash rice well in several changes of cold water until water is clear. Soak rice in cold water to cover overnight.\n" +
                "\n" +
                "Step 2\n" +
                "Drain rice well in a sieve. Set sieve over a large deep saucepan of simmering water (sieve should not touch water) and steam rice, covered with a kitchen towel and a lid, 30 to 40 minutes, or until tender (check water level in pan occasionally, adding more water if necessary).\n" +
                "\n" +
                "Step 3\n" +
                "While rice is cooking, in a small saucepan bring 1 cup coconut milk to a boil with ⅓ cup sugar and salt, stirring until sugar is dissolved, and remove from heat. Keep mixture warm.\n" +
                "\n" +
                "Step 4\n" +
                "Transfer cooked rice to a bowl and stir in coconut-milk mixture. Let rice stand, covered, 30 minutes, or until coconut-milk mixture is absorbed. Rice may be prepared up to this point 2 hours ahead and kept covered at room temperature.\n" +
                "\n" +
                "Step 5\n" +
                "While rice is standing, in cleaned small pan slowly boil remaining ⅓ cup coconut milk with remaining 3 tablespoons sugar, stirring occasionally, 1 minute. Transfer sauce to a small bowl and chill until cool and thickened slightly.\n" +
                "\n" +
                "Step 6\n" +
                "To serve, mold ¼ cup servings of sticky rice on dessert plates. Drizzle desserts with sauce and sprinkle with sesame seeds. Divide mango slices among plates. \n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Thai/MangoStickyRice.jpg");
        foodsTable("Panang Curry","Servings: 5 | Cook Time:  40 MINS\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 1 tablespoon oil\n" +
                        "- 2 tablespoons Panang curry paste *\n" +
                        "- 1 tablespoon peanut butter\n" +
                        "- 2 pounds chicken breasts , cut into pieces against the grain\n" +
                        "- 1 small onion , sliced\n" +
                        "- 1 green bell pepper , thinly sliced\n" +
                        "- 1 red bell pepper , thinly sliced\n" +
                        "- 2 teaspoons freshly grated ginger\n" +
                        "- 4 garlic cloves , minced\n" +
                        "- 2 14 oz cans coconut milk (Chaokoh brand is my favorite)\n" +
                        "- 2 teaspoons cornstarch\n" +
                        "- 1/4 cup light brown sugar , packed\n" +
                        "- 1 tablespoons fish sauce\n" +
                        "- 1 tablespoon lime juice\n" +
                        "- 1 cup loosely packed basil leaves , roughly chopped\n" +
                        "- Hot cooked rice white, brown or jasmine\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "1. Heat oil over medium-high heat in large non-stick skillet. Saute onions for 2 minutes, then add bell peppers, garlic and ginger and saute for 2 minutes more.\n" +
                        "\n" +
                        "2. Add curry paste and peanut butter and saute for 1 minute. Add 1 ½ cans of coconut milk. Whisk cornstarch into remaining ½ can coconut milk then add to the pan. Stir well.\n" +
                        "\n" +
                        "3. Add chicken, stirring to coat. Simmer for 10-15 minutes or just until chicken is no longer pink and sauce begins to thicken.\n" +
                        "\n" +
                        "4. Stir in sugar, fish sauce, lime juice, and basil. Simmer for 5 minutes. Season with salt and pepper, to taste.\n" +
                        "\n" +
                        "5. Serve over hot cooked rice.\n" +
                        "\n" +
                        "\n" +
                        "Notes :\n" +
                        "- Panang Curry Paste: Although you can make it from scratch, I never have those ingredients so prefer to buy it from Amazon or a local Asian market. I like the Mae Ploy Brand. \n" +
                        "- Spice level:  The spiciness of this dish will largely depend on the type and amount of curry paste you use.  I have found Mae Ploy to be a little spicier than other brands (2 tablespoons is medium spicy).\n" +
                        "- Veggies: This is a great recipe to “clean out your veggie drawer”. Try adding mushrooms, zucchini, bean sprouts, spinach, bamboo shoots or carrots.\n" +
                        "- Chicken: You can substitute the chicken for shrimp or tofu.\n" +
                        "- Rice: White, brown, or jasmine rice are best, or serve curry over zoodles or spaghetti squash. \n" +
                        "- Vegetarian and vegan panang:  Use a vegetarian curry paste (one that doesn't contain fish sauce or shrimp paste) like this one.  Also omit the chicken and fish sauce from the recipe and add  additional vegetables of tofu!\n" +
                        "- Make ahead and Storing: This recipe will keep for 5-7 days in the refrigerator (and that makes it a fabulous MEAL PREP dish)!  For even quicker meal prep, you can cut the chicken and slice the red bell peppers in advance.\n" +
                        "- Freezing Instructions: Panang curry can be frozen for 2-3 months.  Allow it to thaw overnight in the refrigerator and reheat on the stove or in the microwave.  Cook rice fresh for serving.\n" +
                        "\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Thai/Panaang-Curry.jpg");
        foodsTable("Tom Yum Talay (Spicy Seafood Soup)","Servings: 5 | Cook Time:  27 mins\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 6 cups chicken stock\n" +
                        "- 1 stalk lemongrass, minced, or 2 1/2 to 3 tablespoons frozen or bottled prepared lemongrass\n" +
                        "- 2 makrut lime leaves\n" +
                        "- 4 cloves garlic, minced\n" +
                        "- 1 teaspoon grated galangal, or ginger\n" +
                        "- 1 to 2 red Thai bird chilies, thinly sliced, or 1 to 2 teaspoons Thai chili sauce\n" +
                        "- 1 cup mushrooms, sliced thinly, optional\n" +
                        "- 12 medium raw shrimp, shelled and deveined\n" +
                        "- 1 to 4 cups mixed seafood of choice, such as mussels, scallops, crab, or fillet\n" +
                        "- 1 medium tomato, cut into thin strips\n" +
                        "- 3 to 4 pieces baby bok choy, optional\n" +
                        "- 7 ounces full-fat coconut milk\n" +
                        "- 2 tablespoons fish sauce\n" +
                        "- 1 tablespoon soy sauce\n" +
                        "- 2 1/2 tablespoons freshly squeezed lime juice\n" +
                        "- 1 teaspoon sugar\n" +
                        "- 1/4 cup coarsely chopped fresh cilantro leaves\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "1. Gather the ingredients.\n" +
                        "\n" +
                        "2. Add the stock, lemongrass, and lime leaves to a large pot over medium-high heat. If using fresh lemongrass, also add the upper stalk pieces for extra flavor. Bring to a boil.\n" +
                        "\n" +
                        "3. Add garlic, galangal, chili, and mushrooms if using. Reduce heat to medium. Simmer until mushrooms are soft, 2 to 3 minutes.\n" +
                        "\n" +
                        "4. Add the shrimp, seafood, tomato, and baby bok choy, if using. Simmer over medium heat until the shrimp turns pink and mussels have opened, 3 to 4 minutes. Scallops, crab, and fish should all be firm to the touch and no longer translucent.\n" +
                        "\n" +
                        "5. Reduce heat to medium-low. Add the coconut milk, fish sauce, soy sauce, lime juice, and sugar, and stir well to combine. Gently simmer until hot (do not boil at this point). Taste-test the soup, adding more fish sauce, soy sauce, lime juice, sugar, or coconut milk, if desired.\n" +
                        "\n" +
                        "6. Divide into bowls and garnish with cilantro. For an extra hit of flavor, you can also add some Thai chili sauce, Nam Prik Pao, either store-bought or homemade. \n"
                        ,
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Thai/tom-yum-talay-soup-recipe.jpg");
        foodsTable("CHICKEN KHAO SOI","Servings: 4 | Cook Time:  1 hour\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "FOR THE KHAO SOI PASTE:\n" +
                "- 2 Thai bird's eye chilies\n" +
                "- 2 medium shallots\n" +
                "- 6 cloves garlic\n" +
                "- 1-inch piece ginger (peeled and sliced)\n" +
                "- 1/4 cup cilantro (stems and leaves, rinsed)\n" +
                "- zest of 1 lime\n" +
                "- 2 teaspoons ground turmeric\n" +
                "- 2 teaspoons ground coriander\n" +
                "- 1 teaspoon curry powder\n" +
                "- 2 tablespoons shrimp paste (Thai, filipino, or Chinese shrimp pastes will all work; can substitute laksa paste)\n" +
                "\n" +
                "FOR THE SOUP:\n" +
                "- 2 tablespoons vegetable oil\n" +
                "- 1 pound boneless, skinless chicken thighs (sliced)\n" +
                "- 2 tablespoons Thai red curry paste\n" +
                "- 4 cups low sodium chicken stock\n" +
                "- 2 teaspoons brown sugar\n" +
                "- 14 ounces unsweetened coconut milk\n" +
                "- 3 tablespoons fish sauce (or to taste)\n" +
                "- 1 pound fresh Chinese egg noodles (thick wonton noodles work well)\n" +
                "\n" +
                "TO GARNISH:\n" +
                "- thinly sliced shallots\n" +
                "- lime wedges\n" +
                "- pickled mustard stems/greens\n" +
                "- crispy noodles\n" +
                "- chopped cilantro\n" +
                "- Thai chili paste (Nam Prik Pao)\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "1. Add all the curry paste ingredients to a food processor and pulse until you get a smooth paste.\n" +
                "\n" +
                "2. Heat oil in a large pot over medium high heat. Add 2 tablespoons vegetable oil and stir-fry the chicken until browned. Remove from the pot and set aside. To the fat left in the pot, add the paste. Fry for 3-5 minutes, until fragrant. Add the canned Thai red curry paste, broth, and brown sugar, and bring to a boil.\n" +
                "\n" +
                "3. Reduce the heat to low. When the broth is at a low simmer, add the coconut milk and fish sauce. Add the chicken back to the broth.\n" +
                "\n" +
                "4. Meanwhile, cook the noodles according to package instructions.\n" +
                "\n" +
                "5. To serve, divide the noodles among 4 bowls. Cover with chicken and broth, and garnish with sliced shallots, lime wedges, pickled mustard greens, fried noodles, cilantro, and Thai chili paste.\n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Thai/khao-soi-11.jpg");
       foodsTable("Pad Prik King","Servings: 4 | Cook Time: 20 minutes\n" +
                       "\n" +
                       "INGREDIENTS :\n" +
                       "\n" +
                       "- 2.67 tbsp coconut oil (or vegetable oil)\n" +
                       "- 466.67 g beef steak (12oz) (cut into thin slices) (you can also use chicken or duck breast, pork or shrimp\n" +
                       "- salt & pepper\n" +
                       "- 5.33 tbsp Maesri Prik Khing curry paste (or any Thai red curry paste)\n" +
                       "- 1.33 shallot (thinly sliced)\n" +
                       "- 266.67 g snake beans (7oz)(or green beans) Cut into 8cm/3\" batons\n" +
                       "- 6.67 kaffir lime leaves\n" +
                       "- 2.67 fresh Thai red chillies (left whole, slit lengthways OR 2 dried Thai chillies) (optional)\n" +
                       "- 2.67 tbsp fish sauce\n" +
                       "- 1.33 tsp palm sugar (or regular sugar)\n" +
                       "\n" +
                       "--------------------------\n" +
                       "\n" +
                       "Instructions :\n" +
                       "1. Heat the oil in a wok or large, deep frying pan until hot and just smoking. Add the steak, together with a pinch of both salt and pepper. Let this fry over a high heat for 2-3 minutes until charred. Remove from the pan and set aside.\n" +
                       "\n" +
                       "2. In the same pan, add the shallot and fry for 30 seconds before adding the curry paste - stir about 30 seconds before adding the beans, kaffir lime leaves and Thai chillies (if using). Splash in around 1 cup of water too.\n" +
                       "\n" +
                       "3. Stir everything and let the beans simmer in the pan for 3 minutes until just cooked through. The sauce should also have reduced a little. \n" +
                       "\n" +
                       "4. Return the beef to the pan with any juices along with the fish sauce and sugar. Stir fry for 30 seconds then remove from the heat, and you’re done!\n" +
                       "\n" +
                       "5. Serve with fluffy jasmine rice.",
               "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Thai/Prik-Khing.jpg");
        foodsTable("Tom Som (Sour Soup)","Servings: 4 | Cook Time: 30 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- 2.67 tablespoons oil (use any neutral flavored oil. i used sunflower oil)\n" +
                "- 2.67 tablespoons sliced shallots or pearl onions or small onions\n" +
                "- 0.67 teaspoon finely chopped garlic\n" +
                "- 0.44 cup chopped carrots\n" +
                "- 0.33 cup chopped french beans\n" +
                "- 2.67 cups chopped white button mushrooms or 200 grams white button mushrooms\n" +
                "- 2 inch galangal\n" +
                "- 2.67 lemon grass stalks\n" +
                "- 4 to 5.33 kaffir lime leaves\n" +
                "- 8 thai chillies or add as required\n" +
                "- 4 cups water\n" +
                "- salt as required\n" +
                "- 2.67 tablespoons lemon juice\n" +
                "- 1.33 teaspoon soy sauce\n" +
                "- 0.67 teaspoon sugar or add as per taste\n" +
                "- 2.67 to 4 tablespoons coriander leaves\n" +
                "(cilantro leaves)\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "1. Firstly rinse and slice or chop all the veggies. Also, peel and finely chop garlic. \n" +
                "\n" +
                "2. Then rinse the lemon grass stalks and remove the outer first or two layers. These layers are stiff and hard layers. discard them or you can add them in your tea or any veg stock that you make. \n" +
                "\n" +
                "3. Smash it lightly with a knife and then slice the lemon grass. Do note that if you do not have lemon grass stalks, then you can use 1 long lemon grass leaf. Just tie it around itself and then add in the soup.\n" +
                "\n" +
                "4. Peel 1.5 inch galangal and slice thinly. Galangal is rough and not easy to slice, so some pressure is required while slicing.\n" +
                "\n" +
                "5. Take 6 small thai chilies and smash each one lightly. Thai chilies can be added less or more as per your choice.\n" +
                "\n" +
                "6. Now slice the chilies diagonally in large pieces.\n" +
                "\n" +
                "Making Tom Yum Soup :\n" +
                "1. Heat oil in a pan. Add 2 tablespoons sliced shallots and ½ teaspoon finely chopped garlic.\n" +
                "\n" +
                "2. Saute for a minute on low to low-medium flame.\n" +
                "\n" +
                "3. Add the chopped veggies and sliced mushrooms. You can add your choice of mix veggies to the soup. \n" +
                "\n" +
                "4. Mix well and saute for a minute.\n" +
                "\n" +
                "5. Then add 3 cups water. You can also use homemade veg stock.\n" +
                "\n" +
                "6. Now add the sliced lemon grass stalks, galangal and thai chilies.\n" +
                "\n" +
                "7. Tear 3 to 4 kaffir lime leaves and then add them.\n" +
                "\n" +
                "8. Season with salt as per requirement and mix well. Do add less salt as we will also be adding soy sauce later.\n" +
                "\n" +
                "Cooking Tom Yum Soup :\n" +
                "1. Cover the pan with lid and simmer on low to medium flame till veggies are done.\n" +
                "\n" +
                "2. Do check at intervals when the veggies are being cooked.\n" +
                "\n" +
                "3. Cook till the veggies are tender and cooked well.\n" +
                "\n" +
                "4. Then add ½ teaspoon sugar. You can even use palm sugar or jaggery or coconut sugar.\n" +
                "\n" +
                "5. Add 1 teaspoon soy sauce.\n" +
                "\n" +
                "6. Mix very well and simmer tom yum soup for a minute.\n" +
                "\n" +
                "7. Switch off flame and then add 2 tablespoons lemon juice. For a less sour taste, you can add 1 tablespoon lemon juice.\n" +
                "\n" +
                "8. Lastly add 2 to 3 tablespoons coriander leaves. Stir and check the seasonings. If required you can add more salt, lemon juice or soy sauce or sugar. \n" +
                "\n" +
                "9. While serving thai tom yum soup remove the lemon grass stalks, red chilies, kaffir lime leaves and galangal. These cannot be chewed as they are stringy and dense. So do make sure not to finely slice or chop them.\n" +
                "Serve tom yum soup hot.Serve with fluffy jasmine rice.\n" +
                "\n" +
                "\n" +
                "Notes :\n" +
                "Substitutions:\n" +
                "- Galangal – ginger (in recipe, add 1 inch ginger)\n" +
                "- Kaffir lime leaves – lime zest or lemon zest (zest from 1 lemon or 1 lime)\n" +
                "- Lemon grass stalks – lemon zest (zest from 1 lemon)\n" +
                "- Small thai red chilies – medium hot to hot green chilies or fresh red chilies (add 1 or 2)\n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Thai/tom-yum-soup-recip.jpg");
        foodsTable("Pad Ped Pla Duk (Spicy Catfish)","Servings: 6 | Cook Time: 30 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- 1 pound catfish, cut into 4x3 inch pieces.\n" +
                "- ⅓ cup oil, divided\n" +
                "- Thai basil 1 cup for stir-frying and about 20 leaves for frying\n" +
                "- 1-3 tablespoons red curry paste. Adjust according to preferred spice level\n" +
                "- Water. Use as needed and up to ⅓ cup. Use unsalted stock for extra flavors.\n" +
                "- 2 tablespoons Krachai, chopped small. Substitute ginger or galangal for 1 tablespoon of each\n" +
                "- 1 tablespoon kaffir leaves, thinly sliced\n" +
                "- 1 large red Serano chilis, seeds removed. Jalapeños are fine too\n" +
                "- 1-2 teaspoon fish sauce\n" +
                "- 1 ½ tablespoon oyster sauce\n" +
                "- 2 tablespoon sugar, white, palm, brown, honey, or agave for the sweetener\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "1. Fry the basil leaves on medium heat for 30 seconds on each side until the leaves are opaque, bright green, and crispy. With a slotted spoon or spatula, quickly remove and place on a plate lined with paper towels. Repeat until all the leaves are done. Fry in batches if necessary. Don’t overcrowd the leaves. Leave to cool at room temperature.\n" +
                "\n" +
                "2. Make the sauce. Combine fish, oyster, and brown sugar in a small bowl and set aside.    \n" +
                "\n" +
                "3. Add oil to a large frying pan on medium-high heat, and fry the fish for 3-4 minutes per side or until lightly golden brown. Don’t touch the fillet until ready to flip over to prevent the meat from falling apart. Once both sides are done, carefully remove the cooked fish and place it on a plate lined with paper towels, set aside. \n" +
                "\n" +
                "4. No need to wash the pan. Only lightly scrape the pan of large bits of food with paper towels if you have large chunks of fish fillet stuck to it. Add 1 tablespoon of oil to medium-high heat on a large skillet. Add the curry paste, break it into small pieces, and stir often. Fry for 1 minute or until fragrant. Turn the stove fan on, as the aroma of the frying curry paste will be strong.\n" +
                "\n" +
                "5. Add the Krachai, kaffir lime leaves, and 2 tablespoons of water and stir. Cook for 1 minute. The curry will start to thicken. You're making a spicy sauce here before adding the fish last.\n" +
                "\n" +
                "6. Add the sauce mixture, chilis, and a small amount of water, around 1-2 tablespoons, or if the curry paste is getting too dry. \n" +
                "\n" +
                "7. Add the fresh basil leaves, and stir well for one minute. Taste and season as needed before adding the fish.\n" +
                "\n" +
                "8. Finally, add the fish, gently stir and scoop the curry sauce into the fillet as best your can. Add 1 more water if necessary (1-2 tablespoons). Cook for 1 more minute. Turn the heat off. Place on a serving plate with jasmine rice and garnish with fried basil leaves, sliced cucumbers, and lime wedges. Enjoy this lovely meal with each perfect bite full of delicious Thai flavors!\n","https://appdeveloperrakib.com/Tasty%20Dishes/Images/Thai/thai-spicy-catfish-recipe_4.jpg");
        foodsTable("GENG GARI GAI AROMATIC CHICKEN CURRY","Servings: 4 | Cook Time: 3 hours 20 minutes\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "GENG GARI CURRY PASTE:\n" +
                        "- 2.5 large dried red chillis grilled\n" +
                        "- 1.5 small dried red chillis grilled\n" +
                        "- 2.5 unpeeled red shallots grilled, then peeled\n" +
                        "- 1 stalks lemongrass sliced\n" +
                        "- 2 coriander roots cleaned and chopped\n" +
                        "- 0.5 pinch whole white pepper\n" +
                        "- 0.25 tablespoon toasted coriander seed finely ground\n" +
                        "- 0.25 teaspoon toasted cumin seed\n" +
                        "\n" +
                        "CHICKEN AND MARINADE :\n" +
                        "- 1 Chicken legs thigh & drumstick\n" +
                        "- 1 tablespoons fish sauce\n" +
                        "- 2 tablespoons geng gari curry paste\n" +
                        "\n" +
                        "THE CURRY :\n" +
                        "- 0.5 cup fresh coconut cream\n" +
                        "- 0.5 teaspoon turmeric powder\n" +
                        "- 0.5 tablespoon toasted ground coriander seed\n" +
                        "- 0.38 tablespoon toasted ground cumin seed\n" +
                        "- pinch of toasted cloves\n" +
                        "- 3 red shallots\n" +
                        "- 0.5 teaspoon palm sugar\n" +
                        "- 1 –3 tablespoons fish sauce\n" +
                        "- additional coconut cream for presentation\n" +
                        "- 0.5 –2 cups chicken stock\n" +
                        "- 1 medium/large ratte potatoes simmered (optionally in chicken stock), peeled and cut into 2 cm cubes\n" +
                        "- 0.5 pandanus leaf knotted\n" +
                        "- 2 cm piece cassia bark toasted\n" +
                        "- 0.5 squeeze mandarin juice\n" +
                        "\n" +
                        "TO FINISH :\n" +
                        "- Deep fried shallots\n" +
                        "- Deep fried garlic\n" +
                        "\n" +
                        "TO SERVE :\n" +
                        "- Jasmine rice\n" +
                        "- Cucumber relish\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "1. Cut the chicken leg into two through the thigh joint. If the pieces are large, cut each one in half again.\n" +
                        "\n" +
                        "2. Marinate the chicken in the fish sauce for an hour and then mix in the curry paste and leave for a few hours.\n" +
                        "\n" +
                        "3. Heat fresh coconut cream and then add marinated chicken and simmer gently along with most of the dried spices and turmeric.\n" +
                        "\n" +
                        "4. When almost cooked (ours took around 40 minutes) add the shallots and simmer, seasoning with palm sugar and fish sauce. Simmer until it becomes quite oily and add extra coconut cream as required.\n" +
                        "\n" +
                        "5. Add the chicken stock and simmer until the chicken is cooked. When the chicken is cooked add the potatoes, the pandanus and toasted cassia bark.\n" +
                        "\n" +
                        "6. Check the seasoning. It should be rich, salty and lightly spiced.\n" +
                        "\n" +
                        "7. With the seasoning correct, leave for 20 minutes in a warm place to let the spices ‘ripen’.\n" +
                        "\n" +
                        "8. Reheat and check the seasoning. Adjust as necessary to taste.\n" +
                        "\n" +
                        "9. Finish with a squeeze of mandarin, if using.\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Thai/GaengGariMakheuaYao.jpg");
        CatList("Thai", R.drawable.thai);
//
//        //----------------------------------------------------
//
        foodsTable("Hamburger", "Servings: 4 | Cook Time: 20 minutes\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 1 ½ pounds lean ground beef\n" +
                        "- ½ onion, finely chopped\n" +
                        "- ½ cup shredded Colby Jack or Cheddar cheese\n" +
                        "- 1 egg\n" +
                        "- 1 (1 ounce) envelope dry onion soup mix\n" +
                        "- 1 clove garlic, minced\n" +
                        "- 1 tablespoon garlic powder\n" +
                        "- 1 teaspoon soy sauce\n" +
                        "- 1 teaspoon Worcestershire sauce\n" +
                        "- 1 teaspoon dried parsley\n" +
                        "- 1 teaspoon dried basil\n" +
                        "- 1 teaspoon dried oregano\n" +
                        "- ½ teaspoon crushed dried rosemary\n" +
                        "\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Preheat an outdoor grill for high heat and lightly oil the grate.\n" +
                        "\n" +
                        "2. Meanwhile, combine ground beef, onion, cheese, egg, onion soup mix, minced garlic, garlic powder, soy sauce, Worcestershire sauce, parsley, basil, oregano, rosemary, salt, and pepper in a large bowl. Use your hands to form the mixture into 4 patties.\n" +
                        "\n" +
                        "3. Cook patties on the preheated grill until no longer pink in the center and the juices run clear, about 4 to 5 minutes per side. An instant-read thermometer inserted into the center should read at least 165 degrees F (74 degrees C).\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/American/hamburger.jpg");
        foodsTable("Hot Dogs", "Servings: 12 | Cook Time: 1 hour 35 minutes\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "For the Filling:\n" +
                        "\n" +
                        "- 1/4 cup very finely minced onion\n" +
                        "- 1 small clove garlic, finely chopped\n" +
                        "- 1 teaspoon ground coriander\n" +
                        "- 1 teaspoon sweet paprika\n" +
                        "- 1/2 teaspoon ground mustard seed\n" +
                        "- 1/4 teaspoon dried marjoram\n" +
                        "- 1/4 teaspoon ground mace\n" +
                        "- 1/4 cup milk\n" +
                        "- 1 large egg white\n" +
                        "- 1 1/2 teaspoons sugar\n" +
                        "- 1 teaspoon salt, or to taste\n" +
                        "- 1 teaspoon freshly ground white pepper\n" +
                        "- 1 pound lean pork, cubed\n" +
                        "- 3/4 pound lean beef, cubed\n" +
                        "- 1/4 pound pork fat, cubed\n" +
                        "\n" +
                        "For the Casing:\n" +
                        "- 4 feet sheep casings (or small hog casings), about 1 1/2 inches in diameter\n" +
                        "- 1 tablespoon white vinegar\n" +
                        "\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Gather the ingredients.\n" +
                        "\n" +
                        "2. In a food processor, puree the onion, garlic, coriander, paprika, mustard seed, marjoram, and mace. Add the milk, egg white, sugar, salt, and pepper and combine well. Remove to a bowl and set aside.\n" +
                        "\n" +
                        "3. One at a time, grind the pork, beef, and fat cubes through the fine blade of a meat grinder. Combine the 3 ingredients and grind them together.\n" +
                        "\n" +
                        "4. In a large bowl, combine the pureed seasonings with the meat and mix with your hands. Wet your hands with cold water to prevent the mixture from sticking.\n" +
                        "\n" +
                        "5. Refrigerate the mixture for 30 minutes and then grind it again. Prepare the casings.\n" +
                        "\n" +
                        "Prepare and Stuff the Casing:\n" +
                        "1. Meanwhile, rinse the casing well under cool running water to remove the salt. Place it in a bowl of cool water and soak for 30 minutes.\n" +
                        "\n" +
                        "2. After soaking, run cool water over the casing. Slip one end of the casing over the faucet nozzle and firmly hold it in place. Turn on the cold water, gently at first, and then more forcefully. This will flush out any salt in the casing and help you spot any breaks. Should you find one, simply snip out a small section of the casing.\n" +
                        "\n" +
                        "3. Put the casing in a bowl of water and add a splash of white vinegar. (A tablespoon of vinegar per cup of water is sufficient.) The vinegar softens the casing and makes it more transparent, which in turn makes the hot dog look nicer. Leave the casing in the water and vinegar solution until you are ready to use it. Rinse it well and drain before stuffing.\n" +
                        "\n" +
                        "4. Using a sausage stuffer, fill the casings with the meat mixture and twist them off into 6-inch links.\n" +
                        "\n" +
                        "5. Parboil the links (but don't separate them) in simmering water for 20 minutes.\n" +
                        "\n" +
                        "6. Place the \u200Bfranks in a bowl of ice water and chill.\n" +
                        "\n" +
                        "7. Remove, pat dry, and refrigerate. You can refrigerate them for up to one week or freeze them for future use.\n" +
                        "\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/American/homemade-hot-dog.jpg");
        foodsTable("Fried Chicken", "Servings: 8 | Cook Time: 1 hour 20 minutes\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 1 (4 pound) chicken, cut into pieces\n" +
                        "- 1 cup buttermilk\n" +
                        "- 2 cups all-purpose flour for coating\n" +
                        "- 1 teaspoon paprika\n" +
                        "- salt and pepper to taste\n" +
                        "- 2 quarts vegetable oil for frying\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Take your cut up chicken pieces and skin them if you prefer.\n" +
                        "\n" +
                        "2. Put the flour in a large plastic bag (let the amount of chicken you are cooking dictate the amount of flour you use). Season the flour with paprika, salt and pepper to taste (paprika helps to brown the chicken).\n" +
                        "\n" +
                        "3. Dip chicken pieces in buttermilk then, a few at a time, put them in the bag with the flour, seal the bag and shake to coat well.\n" +
                        "\n" +
                        "4. Place the coated chicken on a cookie sheet or tray, and cover with a clean dish towel or waxed paper. LET SIT UNTIL THE FLOUR IS OF A PASTE-LIKE CONSISTENCY. THIS IS CRUCIAL!\n" +
                        "\n" +
                        "5. Fill a large skillet (cast iron is best) about 1/3 to 1/2 full with vegetable oil. Heat until VERY hot.\n" +
                        "\n" +
                        "6. Put in as many chicken pieces as the skillet can hold. Brown the chicken in HOT oil on both sides.\n" +
                        "\n" +
                        "7. When browned, reduce heat and cover skillet; let cook for 30 minutes (the chicken will be cooked through but not crispy). Remove cover, raise heat again, and continue to fry until crispy.\n" +
                        "\n" +
                        "8. Drain the fried chicken on paper towels. Depending on how much chicken you have, you may have to fry in a few shifts. Keep the finished chicken in a slightly warm oven while preparing the rest.\n" +
                        "\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/American/Fried_chiken.jpg");
        foodsTable("Pizza", "Servings: 16 | Cook Time: 1 hour 20 minutes\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 2 ½ cups warm water(600 mL)\n" +
                        "- 1 teaspoon sugar\n" +
                        "- 2 teaspoons active dry yeast\n" +
                        "- 7 cups all-purpose flour(875 g), plus more for dusting\n" +
                        "- 6 tablespoons extra virgin olive oil, plus more for greasing\n" +
                        "- 1 ½ teaspoons kosher salt\n" +
                        "- ¼ cup semolina flour(30 g)\n" +
                        "\n" +
                        "OPTIONAL TOPPINGS\n" +
                        "TOMATO SAUCE :\n" +
                        "- 28 oz canned whole tomatoes(795 g)\n" +
                        "- 1 tablespoon kosher salt\n" +
                        "\n" +
                        "MARGHERITA:\n" +
                        "- tomato sauce\n" +
                        "- fresh mozzarella cheese, torn into small pieces\n" +
                        "- fresh basil leaf\n" +
                        "\n" +
                        "TASTY’S BIANCA :\n" +
                        "- extra virgin olive oil\n" +
                        "- fresh mozzarella cheese, torn into small pieces\n" +
                        "- ricotta cheese\n" +
                        "- fresh basil pesto\n" +
                        "- dried oregano\n" +
                        "\n" +
                        "PEPPERONI :\n" +
                        "- tomato sauce\n" +
                        "- fresh mozzarella cheese, torn into small pieces\n" +
                        "- spicy pepperoni slice\n" +
                        "- freshly grated parmesan cheese\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. “Bloom” the yeast by sprinkling the sugar and yeast in the warm water. Let sit for 10 minutes, until bubbles form on the surface.\n" +
                        "\n" +
                        "2. In a large bowl, combine the flour and salt. Make a well in the middle and add the olive oil and bloomed yeast mixture. Using a spoon, mix until a shaggy dough begins to form.\n" +
                        "\n" +
                        "3. Once the flour is mostly hydrated, turn the dough out onto a clean work surface and knead for 10-15 minutes. The dough should be soft, smooth, and bouncy. Form the dough into a taut round.\n" +
                        "\n" +
                        "4. Grease a clean, large bowl with olive oil and place the dough inside, turning to coat with the oil. Cover with plastic wrap. Let rise for at least an hour, or up to 24 hours.\n" +
                        "\n" +
                        "5. Punch down the dough and turn it out onto a lightly floured work surface. Knead for another minute or so, then cut into 4 equal portions and shape into rounds.\n" +
                        "\n" +
                        "6. Lightly flour the dough, then cover with a kitchen towel and let rest for another 30 minutes to an hour while you prepare the sauce and any other ingredients.\n" +
                        "\n" +
                        "7. Preheat the oven as high as your oven will allow, between 450-500˚F (230-260˚C). Place a pizza stone, heavy baking sheet (turn upside down so the surface is flat), or cast iron skillet in the oven.\n" +
                        "\n" +
                        "8. Meanwhile, make the tomato sauce: Add the salt to the can of tomatoes and puree with an immersion blender, or transfer to a blender or food processor, and puree until smooth.\n" +
                        "\n" +
                        "9. Once the dough has rested, take a portion and start by poking the surface with your fingertips, until bubbles form and do not deflate.\n" +
                        "\n" +
                        "10. Then, stretch and press the dough into a thin round. Make it thinner than you think it should be, as it will slightly shrink and puff up during baking.\n" +
                        "\n" +
                        "11. Sprinkle semolina onto an upside down baking sheet and place the stretched crust onto it. Add the sauce and ingredients of your choice.\n" +
                        "\n" +
                        "12. Slide the pizza onto the preheated pizza stone or pan. Bake for 15 minutes, or until the crust and cheese are golden brown.\n" +
                        "\n" +
                        "13. Add any garnish of your preference.\n" +
                        "\n" +
                        "14. Nutrition Calories: 1691 Fat: 65 grams Carbs: 211 grams Fiber: 12 grams Sugars: 60 grams Protein: 65 grams\n" +
                        "\n" +
                        "15. Enjoy!",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/American/homemade-pizz.jpg");
        foodsTable("BBQ Ribs", "Servings: 4 | Cook Time: 2 hour 25 minutes\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "RIBS:\n" +
                        "- 4 pounds (2 kg) baby back pork ribs\n" +
                        "- 2 teaspoons garlic powder\n" +
                        "- 1 teaspoon onion powder\n" +
                        "- 2 teaspoons paprika\n" +
                        "- 2 teaspoons salt\n" +
                        "- 1 teaspoon cracked black pepper\n" +
                        "- 1/2 teaspoon cumin\n" +
                        "- 1 teaspoon chili or Cayenne powder (optional)\n" +
                        "- 2 tablespoons olive oil\n" +
                        "\n" +
                        "SAUCE:\n" +
                        "- 2 cups (500ml) barbecue sauce\n" +
                        "- 3 tablespoons minced garlic\n" +
                        "- 2 tablespoons olive oil\n" +
                        "- 1 tablespoon Worcestershire sauce\n" +
                        "- 1/2 - 1 tablespoon cayenne pepper (optional for heat)\n" +
                        "- 1 teaspoon salt\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Preheat oven to 350°F (180°C).\n" +
                        "\n" +
                        "2. Peel off tough membrane that covers the underside/bony side of the ribs. Place on a baking sheet or tray lined with foil (or parchment paper). \n" +
                        "\n" +
                        "3. Combine together garlic powder, onion powder, paprika, salt, pepper, cumin and chili or Cayenne. Sprinkle seasoning over ribs and drizzle with oil. Rub the seasoning all over the ribs on both sides. Cover tray with foil and bake for 2 hours.\n" +
                        "\n" +
                        "4. During the last 5 minutes of cook time, mix together sauce ingredients.\n" +
                        "\n" +
                        "5. Remove ribs from the oven, remove foil and spread the tops of the ribs with the barbecue sauce mixture.\n" +
                        "\n" +
                        "6. Increase oven temperature to 460°F (240°C). Return ribs to the oven, uncovered, and bake for a further 10 minutes. Change oven settings to broil (or grill) on medium-high heat to lightly char and caramelise the edges (about 3 minutes).\n" +
                        "\n" +
                        "7. Rest for 10 minutes to allow the juices to recirculate back into the meat before slicing.\n" +
                        "\n" +
                        "8. Enjoy!",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/American/Pork-Ribs.jpg");
        foodsTable("Macaroni and Cheese", "Servings: 4 | Cook Time: 25 minutes\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 1 (8 ounce) box elbow macaroni\n" +
                        "- ¼ cup butter\n" +
                        "- ¼ cup all-purpose flour\n" +
                        "- ½ teaspoon salt\n" +
                        "- ground black pepper to taste\n" +
                        "- 2 cups milk\n" +
                        "- 2 cups shredded Cheddar cheese\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Bring a large pot of lightly salted water to a boil. Cook elbow macaroni in the boiling water, stirring occasionally until cooked through but firm to the bite, 8 minutes.\n" +
                        "\n" +
                        "2. At the same time, melt butter in a saucepan over medium heat.\n" +
                        "\n" +
                        "3. Add flour, salt, and pepper and stir until smooth, about 5 minutes.\n" +
                        "\n" +
                        "4. Pour in milk slowly, while stirring continuously. Continue to cook and stir until mixture is smooth and bubbling, about 5 minutes, making sure the milk doesn't burn.\n" +
                        "\n" +
                        "5. Add Cheddar cheese and stir until melted, 2 to 4 minutes.\n" +
                        "\n" +
                        "6. Drain macaroni and fold into cheese sauce until coated.\n" +
                        "\n" +
                        "7. Serve hot and enjoy!\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/American/Macaroni-And-Cheese.jpg");
       foodsTable("Clam Chowder", "Servings: 4 | Cook Time: 1 hour 15 minutes\n" +
                       "\n" +
                       "INGREDIENTS :\n" +
                       "\n" +
                       "- 2.67 strips thick-cut bacon, can sub salt pork\n" +
                       "- 0.89 tablespoons butter\n" +
                       "- 0.44 medium yellow onion, diced\n" +
                       "- 0.89 ribs celery, diced\n" +
                       "- 1.33 cloves garlic, minced\n" +
                       "- 0.44 teaspoon hot sauce, or ½ tsp tabasco sauce\n" +
                       "- 0.44 teaspoon Worcestershire sauce\n" +
                       "- 0.15 cup flour\n" +
                       "- 0.44 cup chicken broth\n" +
                       "- 1.33 cups Half and Half\n" +
                       "- 3.56 oz. clam juice\n" +
                       "- 0.44 chicken bouillon cube\n" +
                       "- 0.44 bay leaf\n" +
                       "- 0.56 lbs. potatoes, see notes\n" +
                       "- 1.33 (6.5 oz. cans) chopped clams, juices reserved\n" +
                       "- Fresh parsley & Freshly cracked pepper, for serving\n" +
                       "\n" +
                       "Seasonings:\n" +
                       "- 0.22 teaspoon EACH: dried oregano, dried parsley\n" +
                       "- 0.11 teaspoon EACH: dried thyme, salt\n" +
                       "- 0.06 teaspoon EACH: smoked paprika, pepper\n" +
                       "\n" +
                       "--------------------------\n" +
                       "\n" +
                       "Instructions :\n" +
                       "\n" +
                       "Prep Work :\n" +
                       "1. Cook the bacon in a 4.5-quart soup pot slowly over low heat. (I cut my bacon in half, it’s easier to fit it in the pan and have it cook evenly.) While the bacon cooks, measure out remaining ingredients. Once the bacon is cooked, set aside on a paper towel lined plate. Chop once cooled and reserve 2 tablespoons of bacon drippings.\n" +
                       "\n" +
                       "2. Wipe any dark spots from the pot but leave as much bacon remnants as you can, as that will add flavor to the soup.\n" +
                       "\n" +
                       "Make the Soup:\n" +
                       "1. Add reserved bacon drippings and butter to the pot over medium heat and use a silicone spatula to “clean” the bottom and sides of the pot. Add the diced onions and celery. Toss to coat and soften for 5-6 minutes. Add the garlic, hot sauce, Worcestershire sauce, and seasonings. Cook for 1 minute.\n" +
                       "\n" +
                       "2. Add the flour and cook for 2 minutes stirring continuously, until the raw flour smell is gone.\n" +
                       "\n" +
                       "3. Add the chicken broth in small splashes, stirring continuously, and wiping the pan “clean” again as you do so. Add the half and half in the same manner.\n" +
                       "\n" +
                       "4. Stir in the chicken bouillon and add the bay leaf. Add the juice from the canned clams to the soup, but don’t add the clams yet. Stir in the additional clam juice.\n" +
                       "\n" +
                       "5. Bring the soup to a gentle boil, then reduce to a simmer, so that its just gently bubbling. Simmer for 20 minutes, partially covered. Stir occasionally as it cooks.\n" +
                       "\n" +
                       "6. Peel and dice the potatoes and add them to the soup. Bring back to a very gentle bubble and let the potatoes cook through for 20-25 minutes, until fork tender. Reduce heat to low.\n" +
                       "\n" +
                       "7. Stir in the clams and let them heat through, about 5 minutes. Remove bay leaf.\n" +
                       "\n" +
                       "8. Ladle soup into serving bowls and garnish with roughly chopped parsley, freshly cracked pepper, and chopped bacon.\n",
               "https://appdeveloperrakib.com/Tasty%20Dishes/Images/American/Clam-Chowder-2.jpg");
       foodsTable("Buffalo Wings", "Servings: 4 | Cook Time: 1 hour\n" +
                       "\n" +
                       "INGREDIENTS :\n" +
                       "\n" +
                       "- 1.5 lb chicken wings, wings and drummettes split, wingtips removed\n" +
                       "- 0.5 Tbsp baking powder, (use aluminum free) \n" +
                       "- 0.5 tsp fine sea salt\n" +
                       "- 1 tsp garlic powder\n" +
                       "\n" +
                       "Buffalo Sauce:\n" +
                       "- 0.13 cup unsalted butter, melted\n" +
                       "- 0.13 cup Franks Original Red Hot Sauce\n" +
                       "- 0.5 tbsp granulated sugar, or brown sugar\n" +
                       "--------------------------\n" +
                       "\n" +
                       "Instructions :\n" +
                       "\n" +
                       "1. Thoroughly pat dry the chicken with a paper towel. Preheat the oven to 450˚F. Line a rimmed baking sheet with foil and place a wire rack over the pan.\n" +
                       "\n" +
                       "2. Combine the baking powder, salt and garlic powder in a bowl, sprinkle over the chicken and toss to combine. Arrange chicken on the prepared wire rack.\n" +
                       "\n" +
                       "3. Bake the chicken for 25 minutes, flip it over and bake for another 25 minutes or until crisp and cooked through.\n" +
                       "\n" +
                       "4. In a medium-size bowl combine sauce ingredients. Remove chicken from the baking sheet to a bowl. Drizzle the sauce over the chicken. Toss to coat the chicken in the sauce. Serve with your favorite dipping sauce.\n",
               "https://appdeveloperrakib.com/Tasty%20Dishes/Images/American/Buffalo-Wings.jpg");
        foodsTable("Meatloaf", "Servings: 4 | Cook Time: 1 hour\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "Meatloaf Ingredients:\n" +
                "- 1 lbs ground beef, 85% or 90% lean\n" +
                "- 0.5 med onion, finely chopped\n" +
                "- 1 large eggs\n" +
                "- 1.5 garlic cloves, minced\n" +
                "- 1.5 Tbsp ketchup\n" +
                "- 1.5 Tbsp fresh parsley, finely chopped\n" +
                "- 0.38 cup Panko breadcrumbs\n" +
                "- 0.17 cup milk\n" +
                "- 0.75 tsp salt, or to taste\n" +
                "- 0.75 tsp Italian seasoning\n" +
                "- 0.13 tsp ground black pepper\n" +
                "- 0.25 tsp ground paprika\n" +
                "\n" +
                "Meatloaf Sauce Ingredients:\n" +
                "- 0.38 cup ketchup\n" +
                "- 0.75 tsp white vinegar\n" +
                "- 1.25 Tbsp brown sugar\n" +
                "- 0.5 tsp garlic powder\n" +
                "- 0.25 tsp onion powder\n" +
                "- 0.13 tsp ground black pepper\n" +
                "- 0.13 tsp salt\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "1. Line a 9”x5” loaf pan with parchment paper and preheat oven to 375°F.\n" +
                "\n" +
                "\n" +
                "2. In a large bowl, add all of the ingredients for the meatloaf. Mix well to combine.\n" +
                "\n" +
                "3. Add meat to the loaf pan, gently press meat down and shape evenly and bake meatloaf at 375˚F for 40 minutes.\n" +
                "\n" +
                "4. In a small bowl, mix all of the ingredients together for the sauce. Spread the sauce over meatloaf then return to oven and bake additional 15-20 minutes or until the internal temperature is 160˚F. Rest meatloaf 10 minutes before slicing. Drizzle with baking juices from the pan.",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/American/Meatloaf-Recipe-2-600x900.jpg");
        foodsTable("Apple Pie", "Servings: 4 | Cook Time: 1 hour\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 0.5 recipe for double pie crust\n" +
                        "- 1.13 lbs Granny Smith Apples, peeled, cored  6-7 apples (7 cups thinly sliced)\n" +
                        "- 0.75 tsp cinnamon\n" +
                        "- 4 Tbsp unsalted butter\n" +
                        "- 1.5 Tbsp  all-purpose flour\n" +
                        "- 0.13 cup water\n" +
                        "- 0.5 cup granulated sugar\n" +
                        "- 0.5 egg , + 1 Tbsp water, for egg wash\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Make the pie crust recipe and chill per instructions while preparing the filling. Preheat oven to 425˚F.\n" +
                        "\n" +
                        "2. Melt butter in a medium saucepan over medium heat. Whisk in 3 Tbsp flour then simmer for 1 minute, whisking constantly. Whisk in 1/4 cup water, 1 cup sugar and bring to a boil. Reduce heat and continue simmering 3 minutes, whisking frequently then remove from heat.\n" +
                        "\n" +
                        "3. Peel, remove cores and thinly slice 7 cups of apples and place them in a large bowl. Sprinkle the top with 1 1/2 tsp cinnamon and toss to combine. Pour the sauce over the apples and stir to coat the apple slices.\n" +
                        "\n" +
                        "4. Sprinkle your work surface with flour and roll out bottom pie crust to a 12\" diameter circle. Wrap it around your rolling pin to transfer it to the 9\" pie plate. Add apple mixture, mounding slightly in the center and being careful not to get the filling on the edges which would make it difficult to seal.\n" +
                        "\n" +
                        "\n" +
                        "5. Roll second crust into an 11\" round and cut into 10 even thickness strips using a pizza cutter. Arrange strips in a woven lattice pattern over the top (see video tutorial). Beat together 1 egg and 1 Tbsp water and brush the top with egg mixture.\n" +
                        "\n" +
                        "6. Bake at 425˚F in the center of the oven for 15 minutes. Reduce the heat to 350˚F and continue baking another 45 minutes or until apples are soft and filling is bubbling through the vents.* Rest at room temp 1 hour before serving. In a small bowl, mix all of the ingredients together for the sauce. Spread the sauce over meatloaf then return to oven and bake additional 15-20 minutes or until the internal temperature is 160˚F. Rest meatloaf 10 minutes before slicing. Drizzle with baking juices from the pan.",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/American/Apple-Pie-5.jpg");
        foodsTable("Pancakes", "Servings: 4 | Cook Time: 20 mins\n" +
                "\n" +
                "INGREDIENTS :\n" +
                "\n" +
                "- 1 ½ cups all-purpose flour\n" +
                "- 3 ½ teaspoons baking powder\n" +
                "- 1 tablespoon white sugar\n" +
                "- ¼ teaspoon salt, or more to taste\n" +
                "- 1 ¼ cups milk\n" +
                "- 3 tablespoons butter, melted\n" +
                "- 1 egg\n" +
                "\n" +
                "--------------------------\n" +
                "\n" +
                "Instructions :\n" +
                "\n" +
                "1. Sift flour, baking powder, sugar, and salt together in a large bowl. Make a well in the center and add milk, melted butter, and egg; mix until smooth.\n" +
                "\n" +
                "2. Heat a lightly oiled griddle or pan over medium-high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake; cook until bubbles form and the edges are dry, about 2 to 3 minutes. Flip and cook until browned on the other side. Repeat with remaining batter.\n" +
                "\n", "https://appdeveloperrakib.com/Tasty%20Dishes/Images/American/Pancakes.jpg");
       foodsTable("Tater Tots", "Servings: 4 | Cook Time: 45 mins\n" +
               "\n" +
               "INGREDIENTS :\n" +
               "\n" +
               "- 2 pounds russet potatoes, peeled\n" +
               "- 1 tablespoon all-purpose flour\n" +
               "- 1 teaspoon garlic powder\n" +
               "- ½ teaspoon onion powder\n" +
               "- ¼ teaspoon dried oregano\n" +
               "- ¼ teaspoon dried dill\n" +
               "- Kosher salt and freshly ground black pepper, to taste\n" +
               "- 3 cups vegetable oil\n" +
               "- 2 tablespoons chopped fresh parsley leaves\n" +
               "\n" +
               "--------------------------\n" +
               "\n" +
               "Instructions :\n" +
               "\n" +
               "1. Place potatoes in a Dutch oven and cover with cold salted water by 1 inch. Bring to a boil; reduce heat and simmer, covered, until parboiled, about 6-7 minutes; drain well and let cool.\n" +
               "\n" +
               "2. Using a box grater, finely shred potatoes. Using a clean dish towel or cheese cloth, drain potatoes completely, removing as much water as possible.\n" +
               "\n" +
               "3. Transfer potatoes to a large bowl. Stir in flour, garlic powder, onion powder, oregano and dill; season with salt and pepper, to taste. The mixture should be workable but dry. Form potatoes into tots.\n" +
               "\n" +
               "4. Heat vegetable oil in a large stockpot or Dutch oven over medium high heat until it registers 360 degrees F on a deep-fry thermometer.\n" +
               "\n" +
               "5. Working in batches, add tots to the Dutch oven and cook until evenly golden and crispy, about 3-4 minutes. Transfer to a paper towel-lined plate.\n" +
               "\n" +
               "6. Serve immediately, garnished with parsley, if desired.*", "https://appdeveloperrakib.com/Tasty%20Dishes/Images/American/Homemade-Tater-Tots.jpg");
        foodsTable("Cornbread", "INGREDIENTS :\n" +
                        "\n" +
                        "- 1 cup all-purpose flour\n" +
                        "- 1 cup yellow cornmeal\n" +
                        "- ⅔ cup granulated sugar\n" +
                        "- 1 teaspoon salt\n" +
                        "- 3 ½ teaspoons baking powder\n" +
                        "- ⅓ cup neutral oil or melted butter\n" +
                        "- 1 large egg\n" +
                        "- 1 cup milk\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Grease a 9-inch round cake pan or cast iron skillet well and set aside. Preheat the oven to 400 degrees.\n" +
                        "\n" +
                        "2. In a medium mixing bowl, add the flour, cornmeal, sugar, salt, and baking powder. Whisk to combine well.\n" +
                        "\n" +
                        "3. Make a well in the center of your dry ingredients and add your oil or butter, milk, and egg. Stir just until the mixture comes together and there are only a few lumps remaining.\n" +
                        "\n" +
                        "4. Pour the batter into the prepared pan and bake for 20-25 minutes until the top is a deep golden brown and a toothpick inserted into the center comes out clean.\n" +
                        "\n" +
                        "5. Serve hot.",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/American/best-homemade-cornbread-recipe-1-of-4-1-1.jpg");
       foodsTable("Reuben Sandwich", "Servings: 4 | Cook Time: 25 mins\n" +
                       "\n" +
                       "INGREDIENTS :\n" +
                       "\n" +
                       "- 8 slices rye bread\n" +
                       "- ½ cup Thousand Island dressing\n" +
                       "- 8 slices Swiss cheese\n" +
                       "- 8 slices deli sliced corned beef\n" +
                       "- 1 cup sauerkraut, drained\n" +
                       "- 2 tablespoons butter, softened\n" +
                       "\n" +
                       "--------------------------\n" +
                       "\n" +
                       "Instructions :\n" +
                       "\n" +
                       "1. Preheat a large griddle or skillet over medium heat.\n" +
                       "\n" +
                       "2. Spread one side of bread slices evenly with Thousand Island dressing. On four bread slices, layer one slice Swiss cheese, 2 slices corned beef, 1/4 cup sauerkraut, and a second slice of Swiss cheese. Top with remaining bread slices, dressing-side down. Butter the top of each sandwich.\n" +
                       "\n" +
                       "3. Place sandwiches, butter-side down on the preheated griddle; butter the top of each sandwich with remaining butter. Grill until both sides are golden brown, about 5 minutes per side. Serve hot.",
               "https://appdeveloperrakib.com/Tasty%20Dishes/Images/American/sanwich.jpg");
        foodsTable("Gumbo", "Servings: 20 | Cook Time: 3 hrs 40 mins\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 1 cup all-purpose flour\n" +
                        "- ¾ cup bacon drippings\n" +
                        "- 1 cup coarsely chopped celery\n" +
                        "- 1 large onion, coarsely chopped\n" +
                        "- 1 large green bell pepper, coarsely chopped\n" +
                        "- 2 cloves garlic, minced\n" +
                        "- 1 pound andouille sausage, sliced\n" +
                        "- 3 quarts water\n" +
                        "- 6 cubes beef bouillon\n" +
                        "- 1 tablespoon white sugar\n" +
                        "- salt to taste\n" +
                        "- 2 tablespoons hot pepper sauce (such as Tabasco®), or to taste\n" +
                        "- ½ teaspoon Cajun seasoning blend (such as Tony Chachere's®), or to taste\n" +
                        "- 4 bay leaves\n" +
                        "- ½ teaspoon dried thyme leaves\n" +
                        "- 1 (14.5 ounce) can stewed tomatoes\n" +
                        "- 1 (6 ounce) can tomato sauce\n" +
                        "- 4 teaspoons file powder, divided\n" +
                        "- 2 tablespoons bacon drippings\n" +
                        "- 2 (10 ounce) packages frozen cut okra, thawed\n" +
                        "- 2 tablespoons distilled white vinegar\n" +
                        "- 1 pound lump crabmeat\n" +
                        "- 3 pounds uncooked medium shrimp, peeled and deveined\n" +
                        "- 2 tablespoons Worcestershire sauce\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Gather all ingredients.\n" +
                        "\n" +
                        "2. Make the roux: Whisk together flour and 3/4 cup bacon drippings in a large, heavy saucepan over medium-low heat until smooth. Cook roux, whisking constantly, until it turns a rich mahogany brown color. This can take 20 to 30 minutes; watch heat carefully and whisk constantly or roux will burn. Remove from heat; continue whisking until mixture stops cooking.\n" +
                        "\n" +
                        "3. Make the gumbo: Place celery, onion, green bell pepper, and garlic into the work bowl of a food processor, and pulse until all vegetables are very finely chopped.\n" +
                        "\n" +
                        "4. Stir vegetables into the roux, and mix in sausage. Bring mixture to a simmer over medium-low heat, and cook until vegetables are tender, 10 to 15 minutes. Remove from heat and set aside.\n" +
                        "\n" +
                        "5. Combine water and beef bouillon cubes in a large Dutch oven or soup pot and bring to a boil over medium-high heat. Stir until bouillon cubes dissolve, then whisk roux mixture into the boiling water.\n" +
                        "\n" +
                        "6. Reduce heat to a simmer and mix in sugar, salt, hot pepper sauce, Cajun seasoning, bay leaves, thyme, stewed tomatoes, and tomato sauce. Simmer soup over low heat for 1 hour; mix in 2 teaspoons of file gumbo powder at the 45-minute mark.\n" +
                        "\n" +
                        "7. Meanwhile, melt 2 tablespoons bacon drippings in a skillet over medium heat. Add okra and vinegar and cook for 15 minutes; remove okra with a slotted spoon, and stir into the simmering gumbo.\n" +
                        "\n" +
                        "8. Mix in crabmeat, shrimp, and Worcestershire sauce, and simmer until flavors have blended, 45 more minutes. Stir in 2 more teaspoons of file gumbo powder just before serving.\n" +
                        "\n" +
                        "9. Serve hot and enjoy!",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/American/gumbo.jpg");
        CatList("American", R.drawable.american);
//
//        //----------------------------------------------------
//
        foodsTable("Kimchi (Fermented Spicy Cabbage)", "Servings: 56 | Cook Time: 4 days 7 hrs\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 2 heads napa cabbage\n" +
                        "- 1 ¼ cups coarse sea salt\n" +
                        "- 1 tablespoon fish sauce\n" +
                        "- 5 green onions, chopped\n" +
                        "- ½ small white onion, minced\n" +
                        "- 2 cloves garlic, pressed\n" +
                        "- 2 tablespoons white sugar\n" +
                        "- 1 teaspoon ground ginger\n" +
                        "- 5 tablespoons gochugaru (Korean chili powder)\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Cut cabbages in half lengthwise and trim the ends. Rinse and cut into pieces about 2 inch square. Place cabbage into large resealable bags; sprinkle salt evenly over leaves to coat. Use your hands to rub salt into cabbage. Seal the bags and leave at room temperature for 6 hours.\n" +
                        "\n" +
                        "2. Rinse cabbage leaves under cold water, at least 2 to 3 times, to remove most of the salt; drain and squeeze out any excess liquid.\n" +
                        "\n" +
                        "3. Place rinsed cabbage in a large container with a tight fitting lid. Stir in fish sauce, green onions, white onion, garlic, sugar, and ginger. Sprinkle Korean chile powder over mixture.; wear plastic gloves to protect your hands and rub chile powder into cabbage leaves until evenly coated.\n" +
                        "\n" +
                        "4. Seal the container and set in a cool dry place. Leave undisturbed for 4 days. Refrigerate before serving, and store in the refrigerator for up to 1 month (if it lasts that long!).\n" +
                        "\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Korean/kimchi.jpg");
        foodsTable("Bulgogi (Marinated Grilled Beef)", "Servings: 4 | Cook Time: 8 hrs 20 mins\n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- ½ onion\n" +
                        "- 3 green onions/scallions\n" +
                        "- 4 inch carrot\n" +
                        "- 1½ lb thinly sliced beef (chuck or ribeye) (can also use tenderloin, top sirloin; If you can’t find thinly sliced beef, you can freeze the block of meat for 2 hours (depending on the size and thickness) prior to slicing (See my tutorial).\n" +
                        "- 1 Tbsp roasted sesame oil\n" +
                        "- ½ Tbsp toasted white sesame seeds (for topping)\n" +
                        "\n" +
                        "Bulgogi Marinade:\n" +
                        "- 4 Tbsp Korean soy sauce\n" +
                        "- 2 Tbsp roasted sesame oil\n" +
                        "- 3 Tbsp brown sugar (don’t substitute with honey as it burns easily)\n" +
                        "- 8 cloves garlic (4 tsp, minced)\n" +
                        "- ½ Asian pear (4 Tbsp, grated; Substitute Asian pear with apple, like Fuji apple, kiwi, or fresh pineapple (a canned variety deactivates an enzyme).\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Gather all the ingredients.\n" +
                        "\n" +
                        "2. For the bulgogi marinade, add to a large bowl 4 Tbsp Korean soy sauce, 2 Tbsp roasted sesame oil, 3 Tbsp brown sugar, and 8 cloves garlic (crushed or minced).\n" +
                        "\n" +
                        "3. Grate ½ Asian pear into the bowl.\n" +
                        "\n" +
                        "4. Add freshly ground black pepper and mix it all together.\n" +
                        "\n" +
                        "5. Cut ½ onion into thin slices and cut 3 green onions/scallions into 2-inch (5-cm) pieces and then cut in half lengthwise.\n" +
                        "\n" +
                        "6. Using a peeler, peel 4 inch carrot into thin strips (or slice thinly). Add the onion, green onions, and carrot to the marinade, and mix all together.\n" +
                        "\n" +
                        "7. Add 1½ lb thinly sliced beef (chuck or ribeye) to the marinade, separating each slice. Mix it all together to coat with the marinade. I wear plastic gloves so I can mix them thoroughly.\n" +
                        "\n" +
                        "8. Set aside for at least 30 minutes or best if overnight.\n" +
                        "\n" +
                        "9. In a large skillet (I use a cast iron grill pan here), heat 1 Tbsp roasted sesame oil on medium high.\n" +
                        "\n" +
                        "10. Cook the marinated meat in a single layer until cooked through, about 5 minutes. Transfer the meat to the plate and sprinkle with ½ Tbsp toasted white sesame seeds.\n" +
                        "\n" +
                        "11. If you have a single serving cast iron plate, you can use it to keep the meat warm for a longer time.\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Korean/Bulgogi-9238.jpg");
        foodsTable("Bibimbap (Mixed Rice Bowl)", "Servings: 4 | Cook Time: 1 hour \n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "Vegetables:\n" +
                        "- 1 long cucumber sliced\n" +
                        "- 1 lb bean sprouts\n" +
                        "- 1 bunch spinach washed\n" +
                        "- 2 teaspoon sesame oil divided\n" +
                        "- 1 tablespoon vegetable oil\n" +
                        "- 1 carrot julienned\n" +
                        "- 1 zucchini julienned\n" +
                        "- 5-6 Chinese/shiitake mushrooms soaked overnight and sliced\n" +
                        "- 1 teaspoon soy sauce\n" +
                        "\n" +
                        "Bulgogi beef:\n" +
                        "- 1 tablespoon vegetable oil\n" +
                        "- ½ lb bulgogi beef\n" +
                        "\n" +
                        "Bibimbap sauce:\n" +
                        "- 2 tablespoon gochujang (Korean red chili pepper paste)\n" +
                        "- 1 teaspoon sesame oil\n" +
                        "- ½ teaspoon garlic powder\n" +
                        "- 1 teaspoon granulated sugar\n" +
                        "- 1 teaspoon rice wine vinegar\n" +
                        "\n" +
                        "For serving:\n" +
                        "- 2 C cooked rice\n" +
                        "- 4 fried eggs or raw if making dolsot-style\n" +
                        "- kimchi\n" +
                        "- sesame seeds\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "Cook the bean sprouts:\n" +
                        "1. Bring a large pot of water up to a boil.\n" +
                        "\n" +
                        "2. Add the bean spouts to a colander or strainer over a sink.\n" +
                        "\n" +
                        "3. Pour some of the hot boiling water over the bean sprouts to lightly blanch.\n" +
                        "\n" +
                        "4. Rinse the sprouts under cold water.\n" +
                        "\n" +
                        "5. Drain well and add 1 teaspoon of sesame oil.\n" +
                        "\n" +
                        "6. Lightly toss and add a sprinkle of sesame seeds.\n" +
                        "\n" +
                        "\n" +
                        "Cook the spinach:\n" +
                        "1. With the remaining hot water, add in the spinach and blanch for 1-2 minutes.\n" +
                        "\n" +
                        "2. Drain the spinach and rinse under cold water.\n" +
                        "\n" +
                        "3. Squeeze out any excess moisture.\n" +
                        "\n" +
                        "4. Add 1 teaspoon of sesame oil.\n" +
                        "\n" +
                        "5. Lightly toss and add a sprinkle of sesame seeds.\n" +
                        "\n" +
                        "\n" +
                        "Cook the remaining vegetables:\n" +
                        "1. Heat up a frying pan or wok over medium-high heat.\n" +
                        "\n" +
                        "2. Add about 1 tablespoon of vegetable oil to the pan.\n" +
                        "\n" +
                        "3. Add the julienned zucchini and sauté, stirring every now and then, until slightly softened, about 1-2 minutes.\n" +
                        "\n" +
                        "4. Transfer the cooked zucchini from the pan into a large separate bowl or dish.\n" +
                        "\n" +
                        "5. Next, add in the julienned carrot and repeat, sauteing until slightly softened, another 2-3 minutes.\n" +
                        "\n" +
                        "6. Transfer the cooked carrot into the dish with the other cooked vegetables.\n" +
                        "\n" +
                        "7. Add the mushrooms to the pan, and sauté, until the mushrooms are cooked through, about 4-5 minutes.\n" +
                        "\n" +
                        "8. Drizzle in 1 teaspoon of soy sauce.\n" +
                        "\n" +
                        "9.Transfer the cooked mushrooms into the dish with the other cooked vegetables. Set aside.\n" +
                        "\n" +
                        "\n" +
                        "Cook the bulgogi beef:\n" +
                        "1. In a large frying pan, add 1 tablespoon of vegetable oil and heat to high heat.\n" +
                        "\n" +
                        "2. Add the thinly sliced marinated beef and stir-fry until the meat is fully cooked, about 5 minutes.\n" +
                        "\n" +
                        "3. Remove from pan and set aside.\n" +
                        "\n" +
                        "\n" +
                        "Make the bibimbap sauce:\n" +
                        "1. In a small bowl, combine gochujang paste with sesame oil, garlic powder, granulated sugar and rice wine vinegar.\n" +
                        "\n" +
                        "2. Mix well. Set aside.\n" +
                        "\n" +
                        "\n" +
                        "Assemble:\n" +
                        "1. Place hot cooked rice into a large bowl.\n" +
                        "\n" +
                        "2. Arrange a small portion of each vegetable in a visually appealing manner around the edge of the bowl.\n" +
                        "\n" +
                        "3. Add a fried sunny side up egg in the center of the bowl. (Or raw egg yolk if making dolsot bibimbap).\n" +
                        "\n" +
                        "4. Garnish with bibimbap sauce and sesame seeds.",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Korean/bibimbap.jpeg");
        foodsTable("Japchae (Stir-Fried Glass Noodles)", "Servings: 6 | Cook Time: 55 Minutes \n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "MAIN :\n" +
                        "- 250 g Korean sweet potato starch noodles (8.8 ounces, dangmyeon)\n" +
                        "- 100 g rib eye fillet (3.5 ounces), cut into strips\n" +
                        "- 1 carrot (120g / 4.2 ounces), rinsed, peeled & julienned\n" +
                        "- 110 g baby spinach (3.9 ounces), rinsed\n" +
                        "- 1/4 red capsicum (bell pepper, 50g), rinsed & julienned\n" +
                        "- 1/2 yellow onion (105g), peeled, rinsed, & thinly sliced\n" +
                        "- 100 g fresh shiitake mushroom , cleaned, stems removed & thinly sliced\n" +
                        "\n" +
                        "SPINACH SEASONING:\n" +
                        "- 1/4 tsp fine sea salt\n" +
                        "- 1/2 tsp minced garlic\n" +
                        "- 1 tsp toasted sesame oil\n" +
                        "\n" +
                        "BEEF MARINADE:\n" +
                        "- 1 Tbsp soy sauce\n" +
                        "- 1 tsp rice wine (mirin)\n" +
                        "- 1/2 tsp minced garlic\n" +
                        "- 1/4 tsp ground black pepper\n" +
                        "- 1 tsp toasted sesame oil\n" +
                        "\n" +
                        "NOODLES & MUSHROOM MARINADE – MIX THESE IN A SMALL BOWL:\n" +
                        "- 4 Tbsp soy sauce\n" +
                        "- 1 Tbsp honey\n" +
                        "- 1 Tbsp brown sugar\n" +
                        "- 1 Tbsp toasted sesame oil\n" +
                        "- 1/8 tsp ground black pepper\n" +
                        "\n" +
                        "FINISHING TOUCH:\n" +
                        "- 1 Tbsp toasted sesame seeds\n" +
                        "- 1 Tbsp toasted sesame oil\n" +
                        "- 1 egg (extra large, Optional) rinsed, egg white and yolk separated\n" +
                        "\n" +
                        "OTHER:\n" +
                        "- cooking oil (I used rice bran oil)\n" +
                        "- fine sea salt\n" +
                        "- water to boil the spinach and the noodles\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "Cook the bean sprouts:\n" +
                        "1. Place the beef strips into a medium bowl. Add the \"beef marinade\" and gently mix the sauce into the meat. Cover the bowl with food wrap and set it aside while you're working on other ingredients.\n" +
                        "\n" +
                        "2. Get the rest of the ingredients ready per below.- Prepare the vegetables as instructed in the “main ingredients” section.\n" +
                        "- Put the sliced mushroom into a medium bowl and add 1 Tbsp of “noodles & mushroom marinade” mixture. Mix them well. Set it aside until you cook it (in about 20 mins).\n" +
                        "- Blanch the spinach in rolling boiling water (5 to 10 seconds). Drain the water and quickly cool it down by running it under cold tap water. Squeeze the spinach to remove any excess water and put it into a mixing bowl.\n" +
                        "Add the \"spinach seasoning\" and mix them gently and evenly. Put it into a large mixing bowl where we will be adding the rest of prepared ingredients in later.\n" +
                        "- Boil some water in a large pot. Once the water starts to boil (6 to 8 mins later), add the noodles and boil them for 6 to 7 mins. Drain the water. Rinse in cold water to cool down and let the water drain for 1 to 2 mins.\n" +
                        "Cut the noodles with a pair of kitchen scissors a couple of times. (Between 15 to 20 cm / 6 to 8 inches length is good). Move the noodles into a mixing bowl and pour in the rest of the \"noodles & mushroom marinade\" mixture. Mix them well. Set it aside until you cook it (in about 10 mins).\n" +
                        "\n" +
                        "3. Start cooking the prepared ingredients per below. Follow the order if you can. We are cooking lighter color to darker color (to minimize the color transfer and avoid washing up in between) and will be using only one non-stick pan/skillet.\n" +
                        "Once each step is completed, move them into the large mixing bowl (except for the first two – egg white and egg yolk), where we will be mixing all ingredients in before serving.\n" +
                        "- Beat the egg white with a fork. Add some cooking oil (1 tsp) on a well heated pan and spread it well. Pour the egg white mixture and cook both sides on low heat (1-2 mins). Transfer it onto a clean cutting board and set aside.\n" +
                        "- Beat the egg yolk with a fork. (If necessary, add more cooking oil onto the pan and spread it well.) Pour the egg yolk mixture and cook both sides on low heat (1-2 mins). Transfer it onto a clean cutting board and set aside.\n" +
                        "- Add more oil if necessary. Cook the onion with a pinch of salt over low to medium heat until it softens (1-2 mins). Transfer it to the large mixing bowl.\n" +
                        "- Add more oil if necessary. Cook the carrots with a pinch of salt over medium heat until it softens (1-2 mins). Transfer it to the large mixing bowl.\n" +
                        "- Add more oil if necessary. Cook the red capsicum with a pinch of salt over low to medium heat until it softens (1-2 mins). Transfer it to the large mixing bowl.\n" +
                        "- Add more oil if necessary. Pour in the marinated mushroom (incl. the residue sauce from the bowl) and stir fry until it is cooked (1-2 mins) over low to medium heat. Transfer it to the large mixing bowl.\n" +
                        "- Add more oil if necessary. Pour in the marinated meat and stir fry until it is cooked (2-3 mins) over medium heat. Transfer it to the large mixing bowl.\n" +
                        "- Add more oil if necessary. Stir fry the marinated noodles until the noodles are well coated with the sauce (2-3 mins) over low to medium heat. Transfer it to the large mixing bowl.\n" +
                        "\n" +
                        "4. Thinly slice the egg white and egg yolk like match sticks. Add them into the large mixing bowl as used above.\n" +
                        "\n" +
                        "5. Add the rest of the “finishing touch” ingredients – sesame oil and sesame seeds in the large mixing bowl and mix them gently and evenly with your hands.\n" +
                        "(Watch your hands, as the ingredients, particularly the noodles might be still hot. You can also use a salad server to mix initially then mix with your hands once it cools down enough.) Serve.\n" +
                        "\n" +
                        "Notes :\n" +
                        "* 1 Tbsp = 15ml\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Korean/noodle.jpg");
        foodsTable("Tteokbokki (Spicy Rice Cakes)", "Servings: 4 | Cook Time: 20 Minutes \n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "MAIN :\n" +
                        "- 700 g Korean rice cakes (12 ounces), separated\n" +
                        "- 300 g Korean fish cakes (5.3 ounces), rinsed over hot water & cut into bite size pieces\n" +
                        "- 4 cups Korean soup stock (dried kelp and dried anchovy stock)\n" +
                        "- 120 g onion (2 ounces), thinly sliced\n" +
                        "\n" +
                        "TTEOKBOKKI SAUCE (MIX THESE IN A BOWL):\n" +
                        "- 6 Tbsp gochujang (Korean chili paste)\n" +
                        "- 3 Tbsp raw sugar\n" +
                        "- 2 Tbsp soy sauce\n" +
                        "- 2 tsp minced garlic\n" +
                        "- 2 tsp gochugaru (Korean chili flakes)\n" +
                        "\n" +
                        "GARNISH:\n" +
                        "- 2 tsp toasted sesame seeds\n" +
                        "- 2 tsp sesame oil\n" +
                        "- 2 stalk green onion , finely chopped\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Unless your rice cakes are soft already, soak them in warm water for 10 mins.\n" +
                        "\n" +
                        "2. Boil the soup stock in a shallow pot over medium high heat and dissolve the tteokbokki sauce by stirring it with a spatula. Once the seasoned stock is boiling, add the rice cakes, fish cakes and onion. Boil them a further 3 to 5 mins until the rice cakes are fully cooked. Then, to thicken the sauce and to deepen the flavor, simmer it over low heat for a further 2 to 4 mins.\n" +
                        "\n" +
                        "3. Add the sesame oil, sesame seeds, and green onion then quickly stir. Serve warm.\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Korean/Tteokbokki.jpg");
       foodsTable("Samgyeopsal (Grilled Pork Belly)", "Servings: 4 | Cook Time: 20 Minutes \n" +
               "\n" +
               "INGREDIENTS :\n" +
               "\n" +
               "- ¼ cup soy sauce \n" +
               "- 2 tablespoons rice vinegar \n" +
               "- 1 tablespoon Gochujang sauce \n" +
               "- 1 teaspoon sesame oil \n" +
               "- ½ teaspoon freshly grated ginger \n" +
               "- ¼ teaspoon garlic powder \n" +
               "- Kosher salt and freshly ground black pepper, to taste\n" +
               "\n" +
               "\n" +
               "--------------------------\n" +
               "\n" +
               "Instructions :\n" +
               "\n" +
               "1. Whisk together the soy sauce, rice vinegar, Gochujang sauce, sesame oil, ginger, and garlic powder in a large bowl. Next, add salt and pepper to taste. \n" +
               "\n" +
               "2. Toss with the marinade until well-coated, and marinate the pork belly for two to forty-eight hours in the fridge before grilling.  \n" +
               "\n" +
               "3. Allowing the meat to marinate for at least two hours adds moisture to the fibres and helps the meat stay moist during the grilling process.\n" +
               "\n", "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Korean/Samgyeopsal.jpg");
        foodsTable("Galbi (Marinated Grilled Short Ribs)", "Servings: 4 | Cook Time: 1 hour 40 Minutes \n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "For the Galbi:\n" +
                        "- 1 medium onion (about 7 ounces; 200g), cut into 1-inch pieces\n" +
                        "- 1 Asian pear (about 6 ounces; 170g), peeled and cut into 1-inch pieces (see note)\n" +
                        "- 5 garlic cloves (25g)\n" +
                        "- 1-inch piece (1/2 ounce; 14g) fresh ginger, peeled and cut into 1/4-inch pieces\n" +
                        "- 1 cup (240ml) soy sauce\n" +
                        "- 1/2 cup (120ml) water\n" +
                        "- 1/4 cup (50g) packed brown sugar\n" +
                        "- 2 tablespoons (30ml) mirin\n" +
                        "- 1 tablespoon (6g) freshly ground black pepper\n" +
                        "- 4 scallions (80g), thinly sliced\n" +
                        "- 2 tablespoons (30ml) toasted sesame oil\n" +
                        "- 2 tablespoons (12g) toasted sesame seeds, lightly crushed\n" +
                        "- 3 pounds (1.4kg) flanken-style beef short ribs, about 1/2-inch-thick (see note)\n" +
                        "\n" +
                        "For serving:\n" +
                        "- Ssamjang\n" +
                        "- Lettuce and perilla leaves, steamed rice, thinly sliced garlic, chiles, and scallions, and assorted banchan\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. For the Galbi: Combine onion, Asian pear, garlic, and ginger in the bowl of a food processor and process to a coarse purée, scraping down sides of food processor bowl as needed, about 30 seconds. Stop processor and add soy sauce, water, brown sugar, mirin, and black pepper to food processor bowl. Continue processing until liquids and sugar are well-combined with vegetables, 15 to 30 seconds longer. Transfer mixture to a medium bowl, and stir in scallions, sesame oil, and sesame seeds.\n" +
                        "\n" +
                        "2. Place beef in a gallon zipper-lock bag or large baking dish, and pour marinade over the short ribs. Toss to evenly distribute the marinade, then seal bag, removing as much air as possible (if using baking dish, wrap tightly with plastic wrap). Transfer short ribs to refrigerator, and marinate for at least 1 hour and up to 24 hours.\n" +
                        "\n" +
                        "3. Light one chimney full of charcoal. When all the charcoal is lit and covered with gray ash, pour out and arrange the coals on one side of the charcoal grate. Set cooking grate in place, cover grill, and allow to preheat for 5 minutes. Alternatively, set half the burners on a gas grill to the highest heat setting, cover, and preheat for 10 minutes. Clean and oil grilling grate.\n" +
                        "\n" +
                        "4. Remove short ribs from marinade and wipe off excess. Place directly over the hot side of the grill. If using a charcoal grill, leave uncovered; if using a gas grill, cover. Cook, turning occasionally, until beef is cooked through and lightly charred on both sides, 6 to 8 minutes total (3 to 4 minutes per side). Transfer to a serving platter and allow to rest for at least 2 minutes before serving.\n" +
                        "\n" +
                        "5.For Serving: Serve short ribs immediately with a pair of kitchen shears on-hand for cutting the meat off the bone and into bite-size pieces. Pass ssamjang, lettuces, garnishes, and banchan at the table.\n" +
                        "\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Korean/aboutcom.jpg");
        foodsTable("Kimbap (Seaweed Rice Rolls)", "Servings: 6 | Cook Time: 1 hour 30 Minutes \n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 9 seaweed sheets (gim)\n" +
                        "\n" +
                        "FOR THE RICE :\n" +
                        "- 2 cups (480 ml, about 450 g) uncooked short grain white rice\n" +
                        "- 2 1/2 cups (600 ml) water\n" +
                        "- 2 tbsp Korean plum extract (maeshil cheong)\n" +
                        "- 1/2 tsp salt\n" +
                        "\n" +
                        "FOR THE FILLING INGREDIENTS :\n" +
                        "- 6 strips pickled radish (danmuji), 1/2 inch thick, drained\n" +
                        "- 6-12 strips braised burdock root (Oeong), drained\n" +
                        "- 6 strips imitation crab meat\n" +
                        "- 2 tbsp oil, divided\n" +
                        "- 10 oz (283 g) package shredded carrot\n" +
                        "- 2 tbsp water\n" +
                        "- 4 eggs, beaten\n" +
                        "\n" +
                        "FOR THE FISHCAKE :\n" +
                        "- 3 sheets flat fish cake, sliced thinly\n" +
                        "- 1 tbsp soy sauce\n" +
                        "- 1 tsp sugar\n" +
                        "- 1 tbsp sweet rice wine (mirim)\n" +
                        "- 1 tbsp corn syrup\n" +
                        "\n" +
                        "FOR THE SPINACH :\n" +
                        "- 1 bunch (12 oz, 340 g) spinach\n" +
                        "- 2 pinches salt\n" +
                        "- 1 tsp sesame oil\n" +
                        "- dashes toasted sesame seeds\n" +
                        "\n" +
                        "EQUIPMENT:\n" +
                        "- bamboo rolling mat\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1.For the rice: Rinse rice several times and drain. Soak rice in 2 1/2 cup water for 10 minutes. Cook rice until soft. Put hot rice in a large mixing bowl, add plum extract and salt; toss well. Cover rice with a kitchen towel and set aside to cool.\n" +
                        "\n" +
                        "2. For the egg: Beat eggs and cook in a skillet in 3 batches. Roll them up and slice thinly\n" +
                        "\n" +
                        "3. For the carrot: cook shredded carrot in a little oil over medium high heat with some salt. Add 2 tbsp of water to create a steam and cover with a lid. Cook for 2 minutes until crisp but tender.\n" +
                        "\n" +
                        "4. For the fishcake: slice fishcake sheets thinly and stir-fry in a little oil for 1 minute over medium high heat. Mix together soy sauce, sugar, and rice wine in a bowl, and add the mixture to the fishcake. Continue to stir-fry for another minute.\n" +
                        "\n" +
                        "5. For the spinach: blanch spinach in a pot of boiling water with some salt. Drain and rinse with cold water. Squeeze out the excess water. Place the spianch in a mixing bowl and season with salt, sesame oil, and sesame seeds. Toss well.\n" +
                        "\n" +
                        "TO ASSEMBLE KIMBAP:\n" +
                        "1. Cut 3 sheets of seaweed in half and set aside.\n" +
                        "\n" +
                        "2. Place a full sheet of seaweed, shiny side down, longer side toward you, on a bamboo rolling mat. Spread about 1 cup of rice (1/6 amount) evenly on the seaweed leaving 1 inch of space at the end. Lay a half seaweed sheet in the middle of rice.\n" +
                        "\n" +
                        "3. Put filling ingredients on top of the half seaweed sheet in a contrasting color pattern.\n" +
                        "\n" +
                        "4. Lift the entire end of mat from your side with both hands, roll over to cover the fillings, tucking in the filling with your fingers. Put firm pressure on the roll and continue to roll again as you roll away the mat until it reaches to the end.\n" +
                        "\n" +
                        "5.Place the finished kimbap on a platter, seam side down, while you are making another. Cut kimbap into 1/2 inch thick slices with a sharp knife.\n" +
                        "\n" +
                        "NOTES :\n" +
                        "- If you want to season rice with sesame oil, toss rice with 1 tbsp sesame oil and 1/2 tsp salt.\n" +
                        "- If you want to season rice with vinegar mixture; whisk together 4 tbsp rice vinegar, 2 tbsp sugar, 1/2 salt in a small mixing bowl. Microwave for 1 minute until sugar dissolves. Pour into rice and toss well.\n",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Korean/kimbap-4.jpg");
       foodsTable("Jajangmyeon (Black Bean Noodles)", "Servings: 3 | Cook Time: 30 Minutes \n" +
                       "\n" +
                       "INGREDIENTS :\n" +
                       "\n" +
                       "- 550 grams thick wheat noodles (fresh kind recommended)\n" +
                       "- 300 grams pork belly chopped\n" +
                       "- 1 small yellow onion finely chopped\n" +
                       "- 1 cup cabbage chopped\n" +
                       "- 1 cup zucchini diced\n" +
                       "- 2 stalks green onion finely chopped\n" +
                       "- ⅓ cup Korean roasted black bean paste aka Chunjang or Jajang\n" +
                       "- 3 tablespoon avocado oil (or any neutral tasting oil)\n" +
                       "- 1 tablespoon oyster sauce\n" +
                       "\n" +
                       "Cornstarch slurry:\n" +
                       "- 2 cups water\n" +
                       "- 2 tablespoon cornstarch or sub with potato starch\n" +
                       "- 2 tablespoon white granulated sugar\n" +
                       "\n" +
                       "Garnish:\n" +
                       "- ¾ cups cucumber thinly sliced for garnish\n" +
                       "\n" +
                       "--------------------------\n" +
                       "\n" +
                       "Instructions :\n" +
                       "\n" +
                       "1. In a bowl, combine sugar, cornstarch and water. Mix well and set aside.\n" +
                       "\n" +
                       "2. In a hot pan set to medium heat, add avocado oil and fry black bean paste for 2-3 minutes stirring constantly. Pour black bean paste and oil into a separate bowl, leaving about 1 tablespoon of oil in the pan. Discard the excess oil in the bowl containing the black bean paste.\n" +
                       "\n" +
                       "3. Fry pork belly in the same oiled pan until cooked and browned on edges.\n" +
                       "\n" +
                       "4. Add yellow onions and green onions and fry until softened. Then add in zucchini and cabbage and fry until softened.\n" +
                       "\n" +
                       "5. Add back in cooked pork and black bean paste. Mix well.\n" +
                       "\n" +
                       "6. Pour cornstarch slurry into pan and mix well. Simmer until it’s thickened. Season with oyster sauce.\n" +
                       "\n" +
                       "7. Boil noodles for 3-4 minutes. Strain. Pour sauce over noodles and garnish with cucumbers.",
               "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Korean/Jajangmyeon-4.jpg");
        foodsTable("Sundubu Jjigae (Soft Tofu Stew)", "Servings: 4 | Cook Time: 40 Minutes \n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "- 700 g Korean soft tofu (12 ounces)\n" +
                        "- 220 g littleneck clams (3.9 ounces), cleaned\n" +
                        "- 6-8 banana prawns (80g / 2.8 ounces), head, shells and guts removed\n" +
                        "- 200 g enoki mushrooms (3.5 ounces), bottom 4-5 cm stem removed and rinsed briefly in cold running water\n" +
                        "- 4 shiitake mushrooms (20g / 0.7 ounces), cleaned, stem removed and thinly sliced\n" +
                        "- 2 egg\n" +
                        "- 2 stalk green onion (10g / 0.4 ounces), diagonally thinly sliced\n" +
                        "\n" +
                        "Soup base:\n" +
                        "- 3 cups Dried kelp and dried anchovy stock\n" +
                        "- 2 Tbsp Korean chili oil or neutral cooking oil (e.g. rice bran oil)\n" +
                        "- 4 Tbsp Korean chili powder or Korean chili flakes(gochugaru)\n" +
                        "- 2 tsp minced garlic\n" +
                        "- 1 Tbsp Korean fish sauce\n" +
                        "- 1 Tbsp soy sauce , kikkoman regular or Korean soup soy sauce\n" +
                        "- fine sea salt , to taste\n" +
                        "- A few sprinkles ground black pepper\n" +
                        "- A dash sesame oil , about 1/2 tsp\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Start heating the pot on the stove over medium low heat and add the chili oil, chili powder, and garlic. Stir them well for about 1 min. Make sure not to burn the chili powder.\n" +
                        "\n" +
                        "2. Add the clams and shrimps and stir quickly to coat them with the chili sauce. Add the fish sauce and soy sauce then stir.\n" +
                        "\n" +
                        "3. Add the dried kelp and anchovy stock and boil it on medium-high heat until it starts to boil rapidly (2 to 3 mins).\n" +
                        "\n" +
                        "4. Add the tofu, mushrooms, and egg and cook them for another 2 to 3 mins. Season with salt, if required.\n" +
                        "\n" +
                        "5. Top up with the green onion, black pepper and sesame oil. Serve hot with Korean rice and side dishes (banchan).\n" +
                        "\n" +
                        "Notes :\n" +
                        "- 1 Tbsp = 15 ml",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Korean/Sundubu.jpg");
        foodsTable("Dakgalbi (Spicy Stir-Fried Chicken)", "Servings: 4 | Cook Time: 55 Minutes \n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "Main :\n" +
                        "- 666.67 g chicken thigh fillets (1.1 pounds), you can use a whole chicken or chicken breast, cut into bite size pieces\n" +
                        "- 0.67 sweet potato (180g / 6.3 ounces), cut into long thick sticks (like English chips)\n" +
                        "- 0.67 carrot (60g / 2.1 ounces), diagonally sliced\n" +
                        "- 0.33 cabbage (320g / 0.7 pounds), shredded\n" +
                        "- 13.33 leaves Korean perilla (35g / 1.2 ounces), thinly sliced\n" +
                        "- 24 pieces Korean rice cakes (175g / 6.1 ounces), separated, if you use pre-packaged rice cakes, separate them first then soak in warm water for 10 minutes before you use them\n" +
                        "- Some cooking oil (2 to 3 Tbsp) - I used rice bran oil\n" +
                        "\n" +
                        "Marinade Sauce:\n" +
                        "- 4 Tbsp gochujang Korean chili paste\n" +
                        "- 2.67 Tbsp rice wine\n" +
                        "- 1.33 Tbsp gochugaru Korean chili flakes\n" +
                        "- 1.33 Tbsp soy sauce\n" +
                        "- 1.33 Tbsp raw sugar\n" +
                        "- 1.33 Tbsp minced garlic\n" +
                        "- 1.33 tsp minced ginger\n" +
                        "- 1.33 tsp Korean curry powder\n" +
                        "- 0.67 onion (35g / 1.2 ounces), grated or minced\n" +
                        "- Few sprinkles ground black pepper\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Combine all the marinade ingredients in a bowl and mix them well. Pour the sauce over the chopped chicken and marinate for at least 30 mins. (Though I strongly recommend marinating it for at least 4 hrs, and if you can afford more time, for overnight for better flavored chicken. However if you are really short of time, 30 mins is OK.)\n" +
                        "\n" +
                        "2. Preheat a large skillet on medium high heat and once heated add some cooking oil. Put all the vegetables and rice cakes into the skillet and add the meat on top. Cook them on medium high heat for 3-4 mins. Then reduce the heat to medium to medium low and cook further until all is cooked (about 10 - 15 mins). During cooking, stir often to avoid food sticking onto the pan. You can cover with a lid to speed up the cooking process.\n" +
                        "\n" +
                        "3. Serve with rice and other Korean side dishes (optional)\n" +
                        "\n" +
                        "Notes :\n" +
                        "- 1 Tbsp = 15 ml",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Korean/Korean-Dakgalbi-Spicy-Chicken-Vegetables-0.jpg");
        foodsTable("Budae Jjigae (Army Stew)", "Servings: 4 | Cook Time: 30 Minutes \n" +
                        "\n" +
                        "INGREDIENTS :\n" +
                        "\n" +
                        "Main :\n" +
                        "- 4 cups chicken stock (1 litre) *see notes above\n" +
                        "- 200 g SPAM thinly sliced\n" +
                        "- 4 cocktail Frankfurt sausages (150g) thinly & diagonally sliced\n" +
                        "- 250 g tofu sliced (about 1.5cm, 1/2 inch thickness)\n" +
                        "- 200 g enoki mushrooms base stem removed & stems separated,\n" +
                        "- 200 g king oyster mushrooms thinly sliced length ways\n" +
                        "- 100 g shiitake mushroom caps thinly sliced\n" +
                        "- 1/2 cup aged Kimchi , cut into bite sized pieces\n" +
                        "- 110 g instant ramen noodles\n" +
                        "- 50 g Korean rice cakes for soup soaked in cold water for 15 mins if it was frozen\n" +
                        "- 30 g green onion thinly & diagonally sliced\n" +
                        "- 1 to 2 slice cheese\n" +
                        "\n" +
                        "Sauce (Mix these in a small bowl):\n" +
                        "- 2 Tbsp Korean chili flakes (Gochugaru)\n" +
                        "- 2 Tbsp rice wine (mirin)\n" +
                        "- 1 Tbsp soy sauce\n" +
                        "- 1 Tbsp minced garlic\n" +
                        "- 1/2 Tbsp sugar\n" +
                        "- 1/2 Tbsp Korean chilli paste (Gochujang)\n" +
                        "- Few sprinkles ground black pepper\n" +
                        "\n" +
                        "--------------------------\n" +
                        "\n" +
                        "Instructions :\n" +
                        "\n" +
                        "1. Assemble the main ingredients (except for instant ramen noodles, rice cakes, green onion and cheese) in a shallow pot. Add the sauce in the middle. Pour the stock in the corner of the pot. Close the lid and boil it on medium high heat until the stock starts to boil (about 8 mins).\n" +
                        "\n" +
                        "2. Add the remaining ingredients – instant ramen noodles, rice cakes, green onion and cheese on top of the pot and boil uncovered until the noodles are cooked (about 2 to 3 mins). Reduce the heat to low (if you’re cooking on a portable burner and sharing the food at the dinning table).\n" +
                        "\n" +
                        "3. Start dishing out soup, protein and vegetables onto your own soup bowl. Serve with steamed rice (& with other Korean side dishes).\n" +
                        "\n" +
                        "Notes :\n" +
                        "- 1 Tbsp = 15 ml",
                "https://appdeveloperrakib.com/Tasty%20Dishes/Images/Korean/7.-Korean-Army-Stew-Budae-Jjigae.jpg");
//        foodsTable("", "", "");
//        foodsTable("", "", "");
//        foodsTable("", "", "");
        CatList("Korean", R.drawable.korean );


    }

    //--------------------------------------------------------------------------------------------------------


}
