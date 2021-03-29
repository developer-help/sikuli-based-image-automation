package com.help.auto.siku;

import org.sikuli.script.FindFailed;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FindFailed, InterruptedException
    {
    	OpenChrome openChrome = new OpenChrome();
    	openChrome.open();
    }
}
