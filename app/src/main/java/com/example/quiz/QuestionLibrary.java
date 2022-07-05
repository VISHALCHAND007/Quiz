package com.example.quiz;

public class QuestionLibrary {
    private String mQues[] = {"Which one of the following river flows between Vindhyan and Satpura ranges?",
                "The Central Rice Research Station is situated in?",
                " Who among the following wrote Sanskrit grammar?",
                "Which among the following headstreams meets the Ganges in last?",
                "The metal whose salts are sensitive to light is?",
                " Patanjali is well known for the compilation of –",
                "River Luni originates near Pushkar and drains into which one of the following?",
                "Which one of the following rivers originates in Brahmagiri range of Western Ghats?",
                "The country that has the highest in Barley Production?",
                "Tsunamis are not caused by"
    };
    private String mOptions[] [] = {
            {"Narmada","Mahanadi","Son","Netravati"},
            {"Chennai","Cuttack","Bangalor","Quilon"},
            {"Kalidase","Charak","Panini","Aryabhatt"},
            {"Alaknanda","Pindar", "Mandakini", "Bhagirathi"},
            {"Zinc","Silver","Copper","Aluminium"},
            {"Yoga Sutra","Panchtantra","Bhrama Sutra","Ayurveda"},
            {"Rann of Kachchh","Arabian Sea","Gulf of Cambay","Lake of Sambhar"},
            {"Pennar","Cauvery","Krishna","Tapti"},
            {"China","India","Russia","France"},
            {"Hurricanes","Earthquakes","Undersea landslides","Volcanic eruptions"}
    };

    private String mAns[] = {"Narmada","Cuttack","Panini","Bhagirathi","Silver","Yoga Sutra","Rann of Kachchh","Cauvery",
                                "Russia", "Hurricanes"};

    public String getmQues(int ind) {
        return mQues[ind];
    }
    public String getChoice1(int ind) {
        return mOptions[ind][0];
    }
    public String getChoice2(int ind) {
        return mOptions[ind][1];
    }
    public String getChoice3(int ind) {
        return mOptions[ind][2];
    }
    public String getChoice4(int ind) {
        return mOptions[ind][3];
    }
    public String getmAns(int ind){
        return mAns[ind];
    }
    public int getSize() {
        return mQues.length;
    }
}
