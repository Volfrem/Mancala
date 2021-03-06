/*
 * generated by Fujaba - CodeGen2
 */
import de.uni_kassel.features.annotation.util.Property; // requires Fujaba5/libs/features.jar in classpath
import de.uni_kassel.features.ReferenceHandler; // requires Fujaba5/libs/features.jar in classpath


public class File extends AbstractFile
{



   public void accept (Visitor visitor )
   {
   }

   public static final String PROPERTY_SIZE = "size";

   @Property( name = PROPERTY_SIZE, kind = ReferenceHandler.ReferenceKind.ATTRIBUTE )
   private int size;

   @Property( name = PROPERTY_SIZE )
   private void setSize (int value)
   {
      this.size = value;
   }

   private File withSize (int value)
   {
      setSize (value);
      return this;
   }

   @Property( name = PROPERTY_SIZE )
   private int getSize ()
   {
      return this.size;
   }

}


