/*
 * generated by Fujaba - CodeGen2
 */
import de.uni_kassel.features.annotation.util.Property; // requires Fujaba5/libs/features.jar in classpath
import de.uni_kassel.features.ReferenceHandler; // requires Fujaba5/libs/features.jar in classpath
import java.util.*;
import de.upb.tools.fca.*; // requires Fujaba5/libs/RuntimeTools.jar in classpath


public class Deck
{



   private  Deck ()
   {
   }

   /**
    * <pre>
    *           0..1     is on top of     0..*
    * Deck ------------------------- Card
    *           deck               card
    * </pre>
    */
   public static final String PROPERTY_CARD = "card";

   @Property( name = PROPERTY_CARD, partner = Card.PROPERTY_DECK, kind = ReferenceHandler.ReferenceKind.TO_MANY,
         adornment = ReferenceHandler.Adornment.PARENT)
   private FHashSet<Card> card;

   @Property( name = PROPERTY_CARD )
   public Set<? extends Card> getCard()
   {
      return ((this.card == null)
              ? Collections.EMPTY_SET
              : Collections.unmodifiableSet(this.card));
   }

   @Property( name = PROPERTY_CARD )
   public boolean addToCard (Card value)
   {
      boolean changed = false;

      if (value != null)
      {
         if (this.card == null)
         {
            this.card = new FHashSet<Card> ();

         }
      
         changed = this.card.add (value);
         if (changed)
         {
            value.setDeck (this);
         }
      
      }
      return changed;
   }

   @Property( name = PROPERTY_CARD )
   public Deck withCard (Card value)
   {
      addToCard (value);
      return this;
   }

   public Deck withoutCard (Card value)
   {
      removeFromCard (value);
      return this;
   }


   public boolean removeFromCard (Card value)
   {
      boolean changed = false;

      if ((this.card != null) && (value != null))
      {
      
         changed = this.card.remove (value);
         if (changed)
         {
            value.setDeck (null);
         }
      
      }
      return changed;
   }

   @Property( name = PROPERTY_CARD )
   public void removeAllFromCard (){
   
      Card tmpValue;
      Iterator<? extends Card> iter = this.iteratorOfCard ();
      while (iter.hasNext ())
      {
         tmpValue = (Card) iter.next ();
         this.removeFromCard (tmpValue);
      }
   
   }

   @Property( name = PROPERTY_CARD )
   public boolean hasInCard (Card value)
   {
      return ((this.card != null) &&
              (value != null) &&
              this.card.contains (value));
   }

   @Property( name = PROPERTY_CARD )
   public Iterator<? extends Card> iteratorOfCard ()
   {
      return ((this.card == null)
              ? FEmptyIterator.<Card>get ()
              : this.card.iterator ());
   }

   @Property( name = PROPERTY_CARD )
   public int sizeOfCard ()
   {
      return ((this.card == null)
              ? 0
              : this.card.size ());
   }

   public static Deck getInstance ()
   {

      return mInstance;
   }

   public static final String PROPERTY_IS_OPEN = "isOpen";

   @Property( name = PROPERTY_IS_OPEN, kind = ReferenceHandler.ReferenceKind.ATTRIBUTE )
   private boolean isOpen;

   @Property( name = PROPERTY_IS_OPEN )
   public void setIsOpen (boolean value)
   {
      this.isOpen = value;
   }

   public Deck withIsOpen (boolean value)
   {
      setIsOpen (value);
      return this;
   }

   @Property( name = PROPERTY_IS_OPEN )
   public boolean isIsOpen ()
   {
      return this.isOpen;
   }

   public static final String PROPERTY_M_INSTANCE = "mInstance";

   @Property( name = PROPERTY_M_INSTANCE, kind = ReferenceHandler.ReferenceKind.ATTRIBUTE )
   private static Deck mInstance;


   public static final String PROPERTY_NAME = "name";

   @Property( name = PROPERTY_NAME, kind = ReferenceHandler.ReferenceKind.ATTRIBUTE )
   private String name;

   @Property( name = PROPERTY_NAME )
   public void setName (String value)
   {
      this.name = value;
   }

   public Deck withName (String value)
   {
      setName (value);
      return this;
   }

   @Property( name = PROPERTY_NAME )
   public String getName ()
   {
      return this.name;
   }

   public void removeYou()
   {
      this.removeAllFromCard ();
   }
}


