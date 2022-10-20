package com.solegendary.reignofnether.resources;

// actions that server can take to clients
public enum ResourcesAction {
    SYNC, // replace Resources objects if existing or append to list if not
    ADD_SUBTRACT, // add/subtract the given resources over time and show the +- amount
    ADD_SUBTRACT_INSTANT, // add/subtract the given resources instantly without showing the amount
    WARN_INSUFFICIENT_RESOURCES, // warns the client that place a building or start a production item due to insufficient resources
    WARN_INSUFFICIENT_POPULATION, // warns the client that they do not have enough population supply
    WARN_MAX_POPULATION // warns the client that they are at the highest possible population
}