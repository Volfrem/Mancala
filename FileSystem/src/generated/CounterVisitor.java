/*
 * generated by Fujaba - CodeGen2
 */
import de.uni_kassel.features.annotation.util.Property; // requires Fujaba5/libs/features.jar in classpath
import de.uni_kassel.features.ReferenceHandler; // requires Fujaba5/libs/features.jar in classpath
import de.upb.tools.sdm.*; // requires Fujaba5/libs/RuntimeTools.jar in classpath


public class CounterVisitor extends Visitor
{



   public static final String PROPERTY_FILE_COUNT = "fileCount";

   @Property( name = PROPERTY_FILE_COUNT, kind = ReferenceHandler.ReferenceKind.ATTRIBUTE )
   private int fileCount;

   @Property( name = PROPERTY_FILE_COUNT )
   public void setFileCount (int value)
   {
      this.fileCount = value;
   }

   public CounterVisitor withFileCount (int value)
   {
      setFileCount (value);
      return this;
   }

   @Property( name = PROPERTY_FILE_COUNT )
   public int getFileCount ()
   {
      return this.fileCount;
   }

   public void visit (Directory directory )
   {
   }

   public void visit (File file )
   {
      boolean fujaba__Success = false;

      // story pattern storypatternwiththis
      try 
      {
         fujaba__Success = false; 

         // assign attribute this
         this.setFileCount (this.fileCount+1);
         fujaba__Success = true;
      }
      catch ( JavaSDMException fujaba__InternalException )
      {
         fujaba__Success = false;
      }

      return ;
   }

}


