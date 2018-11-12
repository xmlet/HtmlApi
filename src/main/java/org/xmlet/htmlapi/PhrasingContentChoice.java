package org.xmlet.htmlapi;

public interface PhrasingContentChoice<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default A<T> a() {
      return (A)this.addChild(new A(this.self()));
   }

   default Abbr<T> abbr() {
      return (Abbr)this.addChild(new Abbr(this.self()));
   }

   default Area<T> area() {
      return (Area)this.addChild(new Area(this.self()));
   }

   default Audio<T> audio() {
      return (Audio)this.addChild(new Audio(this.self()));
   }

   default B<T> b() {
      return (B)this.addChild(new B(this.self()));
   }

   default Bdo<T> bdo() {
      return (Bdo)this.addChild(new Bdo(this.self()));
   }

   default Br<T> br() {
      return (Br)this.addChild(new Br(this.self()));
   }

   default Button<T> button() {
      return (Button)this.addChild(new Button(this.self()));
   }

   default Canvas<T> canvas() {
      return (Canvas)this.addChild(new Canvas(this.self()));
   }

   default Cite<T> cite() {
      return (Cite)this.addChild(new Cite(this.self()));
   }

   default Code<T> code() {
      return (Code)this.addChild(new Code(this.self()));
   }

   default Command<T> command() {
      return (Command)this.addChild(new Command(this.self()));
   }

   default Datalist<T> datalist() {
      return (Datalist)this.addChild(new Datalist(this.self()));
   }

   default Del<T> del() {
      return (Del)this.addChild(new Del(this.self()));
   }

   default Dfn<T> dfn() {
      return (Dfn)this.addChild(new Dfn(this.self()));
   }

   default Em<T> em() {
      return (Em)this.addChild(new Em(this.self()));
   }

   default Embed<T> embed() {
      return (Embed)this.addChild(new Embed(this.self()));
   }

   default I<T> i() {
      return (I)this.addChild(new I(this.self()));
   }

   default Iframe<T> iframe() {
      return (Iframe)this.addChild(new Iframe(this.self()));
   }

   default Img<T> img() {
      return (Img)this.addChild(new Img(this.self()));
   }

   default Input<T> input() {
      return (Input)this.addChild(new Input(this.self()));
   }

   default Ins<T> ins() {
      return (Ins)this.addChild(new Ins(this.self()));
   }

   default Kbd<T> kbd() {
      return (Kbd)this.addChild(new Kbd(this.self()));
   }

   default Keygen<T> keygen() {
      return (Keygen)this.addChild(new Keygen(this.self()));
   }

   default Label<T> label() {
      return (Label)this.addChild(new Label(this.self()));
   }

   default Link<T> link() {
      return (Link)this.addChild(new Link(this.self()));
   }

   default Map<T> map() {
      return (Map)this.addChild(new Map(this.self()));
   }

   default Mark<T> mark() {
      return (Mark)this.addChild(new Mark(this.self()));
   }

   default Meta<T> meta() {
      return (Meta)this.addChild(new Meta(this.self()));
   }

   default Meter<T> meter() {
      return (Meter)this.addChild(new Meter(this.self()));
   }

   default Noscript<T> noscript() {
      return (Noscript)this.addChild(new Noscript(this.self()));
   }

   default Object<T> object() {
      return (Object)this.addChild(new Object(this.self()));
   }

   default Output<T> output() {
      return (Output)this.addChild(new Output(this.self()));
   }

   default Progress<T> progress() {
      return (Progress)this.addChild(new Progress(this.self()));
   }

   default Q<T> q() {
      return (Q)this.addChild(new Q(this.self()));
   }

   default Ruby<T> ruby() {
      return (Ruby)this.addChild(new Ruby(this.self()));
   }

   default Samp<T> samp() {
      return (Samp)this.addChild(new Samp(this.self()));
   }

   default Script<T> script() {
      return (Script)this.addChild(new Script(this.self()));
   }

   default Select<T> select() {
      return (Select)this.addChild(new Select(this.self()));
   }

   default Small<T> small() {
      return (Small)this.addChild(new Small(this.self()));
   }

   default Span<T> span() {
      return (Span)this.addChild(new Span(this.self()));
   }

   default Strong<T> strong() {
      return (Strong)this.addChild(new Strong(this.self()));
   }

   default Sub<T> sub() {
      return (Sub)this.addChild(new Sub(this.self()));
   }

   default Sup<T> sup() {
      return (Sup)this.addChild(new Sup(this.self()));
   }

   default Svg<T> svg() {
      return (Svg)this.addChild(new Svg(this.self()));
   }

   default Textarea<T> textarea() {
      return (Textarea)this.addChild(new Textarea(this.self()));
   }

   default Time<T> time() {
      return (Time)this.addChild(new Time(this.self()));
   }

   default Var<T> var() {
      return (Var)this.addChild(new Var(this.self()));
   }

   default Video<T> video() {
      return (Video)this.addChild(new Video(this.self()));
   }
}
