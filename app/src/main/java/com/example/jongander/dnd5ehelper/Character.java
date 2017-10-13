package com.example.jongander.dnd5ehelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JONGander on 2017-10-11.
 */

public class Character {

    String name;
    boolean inspiration;
    Integer proficiencyBonus;

    //Saving Throws
    Integer savingThrow;

    //Attributes
    Integer strength, dexterity, constitution, intelligence, wisdom, charisma =0;

    //Appearance
    Integer age;
    Integer height;
    Integer weight;
    String eyes;
    String skin;
    String hair;

    //Misc details
    String backstory;
    ArrayList<String> features;
    ArrayList<String> traits;

    //PC or NPC? default false because this will mostly be used for character creation
    //  toggle for "DM Mode"?
    boolean isNPC = false;



}
