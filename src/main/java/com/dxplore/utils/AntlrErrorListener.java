/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.utils;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.BitSet;

/**
 * Created by motty on 17/02/2016.
 */
public class AntlrErrorListener implements ANTLRErrorListener {

    // Logger
    private static final Logger logger = LoggerFactory.getLogger("AntlrErrorListener");

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
        logger.error(String.format("ANTLR syntaxError: recognizer:%s, Object:%s, %d, %d, %s",
                recognizer.toString(), o.toString(), i, i1, s));
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
        //logger.error("reportAmbiguity: " + dfa.toLexerString());
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {
        //logger.error("reportAttemptingFullContext: " + dfa.toLexerString());
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {
        //logger.error("reportContextSensitivity: " + dfa.toLexerString());
    }
}
