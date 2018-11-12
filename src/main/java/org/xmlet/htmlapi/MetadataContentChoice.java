package org.xmlet.htmlapi;

public interface MetadataContentChoice<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Base<T> base() {
      return (Base)this.addChild(new Base(this.self()));
   }

   default Command<T> command() {
      return (Command)this.addChild(new Command(this.self()));
   }

   default Link<T> link() {
      return (Link)this.addChild(new Link(this.self()));
   }

   default Meta<T> meta() {
      return (Meta)this.addChild(new Meta(this.self()));
   }

   default Noscript<T> noscript() {
      return (Noscript)this.addChild(new Noscript(this.self()));
   }

   default Script<T> script() {
      return (Script)this.addChild(new Script(this.self()));
   }

   default Style<T> style() {
      return (Style)this.addChild(new Style(this.self()));
   }

   default Title<T> title() {
      return (Title)this.addChild(new Title(this.self()));
   }
}
