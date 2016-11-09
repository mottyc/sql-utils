/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.utils;

import com.dxplore.model.CompoundJoinEntity;
import com.dxplore.model.StatementEntity;

import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by motty on 15/02/2016.
 */
public class ModelManager {

    /**
     * Statements map
     */
    private BlockingQueue<CompoundJoinEntity> joinsQueue = new ArrayBlockingQueue<CompoundJoinEntity>(10000);

    /**
     * Joins map
     */
    private HashMap<String, CompoundJoinEntity> joins = new HashMap<String, CompoundJoinEntity>();
    public HashMap<String, CompoundJoinEntity> getJoins() { return joins; }
    public void setJoins(HashMap<String, CompoundJoinEntity> value) { this.joins = value; }

    //private BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10000);

    /**
     * Default Constructor
     */
    public ModelManager(){}

    /**
     * Add compound join to the model
     * @param join
     */
    public synchronized void addCompoundJoin(CompoundJoinEntity join) {
        String joinId =  join.toString();
        if (this.joins.containsKey(joinId)) {
            this.joins.get(joinId).incrementWeight();
        } else {
            this.joins.put(joinId, join);
        }
    }

    /**
     * Add compound join to the queue
     * @param join
     */
    public void queueCompoundJoin(CompoundJoinEntity join) {
        try {
            this.joinsQueue.put(join);
        } catch (Exception ex) {
            return;
        }
    }

    /**
     * Poll item from the queue
     * @param timeOut
     * @param unit
     * @return
     */
    public CompoundJoinEntity pullCompoundJoin(long timeOut, TimeUnit unit) {
        try {
            return this.joinsQueue.poll(timeOut, unit);
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * Is joins queue has items
     * @return
     */
    public boolean hasItemsInQueue() {
        return (this.joinsQueue.isEmpty() == false);
    }
}
