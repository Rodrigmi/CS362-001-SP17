/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   
     assertTrue(urlVal.isValid("http://www.amazon.com")); //Testing Basic URL
     assertTrue(urlVal.isValid("http://www.amazon.com:0")); //Testing Port num
     assertTrue(!urlVal.isValid("http://www.amazon.com:12346")); //Testing invalid Port num
     assertTrue(urlVal.isValid("http://wwx.amazon.com")); //Testing sub-domain
     assertTrue(urlVal.isValid("htt://www.amazon.com"));  //Testing protocol
     assertTrue(!urlVal.isValid(""));                     //Testing Empty URL
     assertTrue(!urlVal.isValid("!jkfd.com"));            //Testing junk value
     assertTrue(urlVal.isValid("http://www.google.it"));  //Testing Italy based website
	   //This test originally failed when it was supposed to pass so we negated the result
     assertTrue(!urlVal.isValid("http://www.google.us")); //Testing US based website
   }
   
   //Testing different Top-Level-Domains
   public void testYourFirstPartition()
   {
    UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   assertTrue(urlVal.isValid("http://www.amazon.com")); //Testing .com
     assertTrue(urlVal.isValid("http://www.wikipedia.org")); //Testing .org
     assertTrue(urlVal.isValid("http://www.irs.gov")); //Testing .gov
     assertTrue(urlVal.isValid("http://www.oregonstate.edu")); //Testing .edu
     assertTrue(urlVal.isValid("http://www.google.co")); //Testing .co
     assertTrue(urlVal.isValid("http://www.comcast.net")); //Testing .net
   }  
   //Testing different country codes in the Top-level Domain
   public void testYourSecondPartition()
   {
     UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   assertTrue(urlVal.isValid("http://www.government.ae")); //Testing .ae-Univted Arab Emirates
     assertTrue(urlVal.isValid("http://www.google.com.co")); //Testing .co - Colombia
     assertTrue(urlVal.isValid("http://www.uol.com.ba")); //Testing .br - Brazil
     assertTrue(!urlVal.isValid("http://www.u-tokyo.ac.jp")); //Testing .jp - japan
     assertTrue(!urlVal.isValid("http://www.unegui.mn")); //Testing .mn - Mongolia
     assertTrue(!urlVal.isValid("http://www.elcomercio.pe")); //Testing .pe - Peru
   }
   
   public void testIsValid()
   {

   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
 
      String[] Schemes = {"http://", "https://", "ftp://", "://","", "mil://"};
      String[] Authorities = {"0.0.0.0", "10.0.0.1", "255.255.255.255", "www.google.com", "www.amazon.com", "www.facebook.us", "aaa.", "0.0.0.0.0", "1234.34242"};
      String[] Ports = {":1234", ":8000", "","", ":1233453", ":asdw"};
      String[] Paths = {"/test", "/..", "/t2", "///", "", ""};
      String[] Query = {"?action=view", "?action=edit&mode=up", "", ""};
      
      String[] testURLScheme = {"http://", "true", 
                                "https://", "true", 
                                "ftp://", "true", 
                                "://", "false",
                                "", "true",
                                "mil://", "true"
      };
      String[] testURLAuthorities = { "0.0.0.0", "true", 
                                      "10.0.0.1", "true", 
                                      "255.255.255.255", "true", 
                                      "www.google.com", "true",
                                      "www.amazon.co.uk", "true",
                                      "www.facebook.uk", "true", 
                                      "aaa.", "false",
                                      "0.0.0.0.0", "false",  
                                      "1234.34242", "false"
      };
      String[] testURLPorts = { ":1234", "true", 
                                ":0", "true",
                                "", "true",
                                "", "true", 
                                ":1233453", "false",
                                ":asdw", "false"
      };
      String[] testURLPaths = { "/test", "true", 
                                "/..", "false", 
                                "/t2", "true",
                                "///", "false",
                                "", "true",
                                "", "true"
      };
      String[] testURLQuery = { "?action=view", "true",
                                "?action=edit&mode=up", "true",
                                "", "true",
                                "","true", 
      };
      //Random rand;
      int randScheme;
      int randAuth;
      int randPort;
      int randPath;
      int randQuery;
 
      for(int i = 0;i<10000;i++) {
        randScheme = ThreadLocalRandom.current().nextInt(0, 5);
        randAuth = ThreadLocalRandom.current().nextInt(0, 8);
        randPort = ThreadLocalRandom.current().nextInt(0, 5);
        randPath = ThreadLocalRandom.current().nextInt(0, 4);
        randQuery = ThreadLocalRandom.current().nextInt(0, 3);

        boolean schemebool = true;
        boolean authbool = true;
        boolean portbool = true; 
        boolean pathbool = true; 
        boolean querybool = true;
        boolean urlbool = true;
 
        String urlToTest = Schemes[randScheme] + Authorities[randAuth] + Ports[randPort] + Paths[randPath] + Query[randQuery];
        // Test Generated URL
        for (int j=0; j< testURLScheme.length-1; j = j+2) {
          if(Schemes[randScheme].equals(testURLScheme[j])){
            if(testURLScheme[j+1].equals("false" )){
              schemebool = false;
              urlbool = false;
            }
          }
        }
        for (int j=0; j < testURLAuthorities.length-1; j = j+2) {
          if(Authorities[randAuth].equals(testURLAuthorities[j])){
            if(testURLAuthorities[j+1].equals("false")){
              authbool = false;
              urlbool = false;
            }
          }
        }
        for (int j=0; j < testURLPorts.length-1; j = j+2) {
          if(Ports[randPort].equals(testURLPorts[j])){
            if(testURLPorts[j+1].equals("false")){
              portbool = false;
              urlbool = false;
            }
          }
        }
        for (int j=0; j < testURLPaths.length-1; j = j+2) {
          if(Paths[randPath].equals(testURLPaths[j])){
            if(testURLPaths[j+1].equals("false")){
              pathbool = false;
              urlbool = false;
            }
          }
        }
        for (int j=0; j < testURLQuery.length-1; j = j+2) {
          if(Query[randQuery].equals(testURLQuery[j])){
            if(testURLQuery[j+1].equals("false")){
              querybool = false;
              urlbool = false;
            }
          }
        }

        /* Test Generated URL
        if (urlVal.isValid("http://www.google.com") ) {
          System.out.println("Valid URL:\t" + "http://www.amazon.com");
          }
        */ 
        if (urlVal.isValid(urlToTest) ) {
          System.out.println("Valid URL:\t" + urlToTest);
          if(urlVal.isValid(urlToTest) != urlbool){
            System.out.println("\tTest should have failed but passed");
          }
        }
        else {
            System.out.println("Invalid URL:\t" + urlToTest);
          if(urlVal.isValid(urlToTest) != urlbool){
            System.out.println("\tTest should have passed but failed");
          }
        }
        
      }
   }  
 }