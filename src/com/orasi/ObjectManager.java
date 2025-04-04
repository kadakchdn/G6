
package com.orasi;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.*;
import com.orasi.datasource.*;


public class ObjectManager {
  private static final ObjectManager singleton = new ObjectManager();
  
  public static final ObjectManager instance() {
    return singleton;
  }
  
  private final Map<String,ByFactory> objectMap = new HashMap<>( 10 );
  
  private ObjectManager() {
    ByFactoryCollection bC = null;
    /*
    Site: www.facebook.com
    Add a description of www.facebook.com
    */
    /* Page: Facebook  log in or sign up 
    
    */

    

bC = new ByFactoryCollection("email", "32706.1540", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='text']", "AttributeRule", "32706.1542", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='text']", "AttributeRule", "32706.1544", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='inputtext _55r1 _6luy']", "AttributeRule", "32706.1546", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='inputtext _55r1 _6luy']", "AttributeRule", "32706.1548", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@data-testid='royal-email']", "AttributeRule", "32706.1550", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-email']", "AttributeRule", "32706.1552", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='Email address or phone number']", "AttributeRule", "32706.1554", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Email address or phone number']", "AttributeRule", "32706.1556", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@autofocus='1']", "AttributeRule", "32706.1558", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@autofocus='1']", "AttributeRule", "32706.1560", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-label='Email address or phone number']", "AttributeRule", "32706.1562", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Email address or phone number']", "AttributeRule", "32706.1564", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"email\"]", "IDRule", "32706.1566", "" ) );
bC.add( new ByFactory( ById.class, "email", "IDRule", "32706.1568", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"email\"]", "IDRule", "32706.1570", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"email\"]", "NameRule", "32706.1572", "" ) );
bC.add( new ByFactory( ByName.class, "email", "NameRule", "32706.1574", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"email\"]", "NameRule", "32706.1576", "" ) );


objectMap.put( "32706.1540", bC );


bC = new ByFactoryCollection("pass", "32706.1580", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='password']", "AttributeRule", "32706.1582", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='password']", "AttributeRule", "32706.1584", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='inputtext _55r1 _6luy _9npi']", "AttributeRule", "32706.1586", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='inputtext _55r1 _6luy _9npi']", "AttributeRule", "32706.1588", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@data-testid='royal-pass']", "AttributeRule", "32706.1590", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-pass']", "AttributeRule", "32706.1592", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='Password']", "AttributeRule", "32706.1594", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Password']", "AttributeRule", "32706.1596", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-label='Password']", "AttributeRule", "32706.1598", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Password']", "AttributeRule", "32706.1600", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"pass\"]", "IDRule", "32706.1602", "" ) );
bC.add( new ByFactory( ById.class, "pass", "IDRule", "32706.1604", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"pass\"]", "IDRule", "32706.1606", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"pass\"]", "NameRule", "32706.1608", "" ) );
bC.add( new ByFactory( ByName.class, "pass", "NameRule", "32706.1610", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"pass\"]", "NameRule", "32706.1612", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='_6luy _55r1 _1kbt']/input[1]", "ParentRule[AttributeRule]", "32706.1614", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='_6luy _55r1 _1kbt']/input[1]", "ParentRule[AttributeRule]", "32706.1616", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"passContainer\"]/input[1]", "ParentRule[IDRule]", "32706.1618", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"passContainer\"]/input[1]", "ParentRule[IDRule]", "32706.1620", "" ) );


objectMap.put( "32706.1580", bC );




  }
  
  public By getObject( Object alchemyIdentifier, Map<String,Object> contextMap, DataSourceProvider dM ) {
    
    if ( alchemyIdentifier instanceof By ) {
      return (By) alchemyIdentifier;
    }
    
    ByFactory by = objectMap.get( alchemyIdentifier + "" );
    if ( by == null ) {
      return new By() {
        @Override
        public List<WebElement> findElements(SearchContext sc) {
          throw new RuntimeException( "Could not find and object using [" + alchemyIdentifier + "]" );
        }
      };
    }
    return by.create(contextMap, dM);
  }

  public ByFactory getObject( String alchemyIdentifier ) {
   
    return objectMap.get( alchemyIdentifier );
  }
}
