package org.xmlet.htmlapi;

public interface LegendChoice0<T extends Element<T, Z>, Z extends Element> extends FlowContentChoice<T, Z>, PhrasingContentChoice<T, Z> {
   @Override
   default Small<T> small() {
      return this.addChild(new Small(this.self()));
   }

   @Override
   default Select<T> select() {
      return this.addChild(new Select(this.self()));
   }

   @Override
   default Textarea<T> textarea() {
      return this.addChild(new Textarea(this.self()));
   }

   @Override
   default Del<T> del() {
      return this.addChild(new Del(this.self()));
   }

   @Override
   default Output<T> output() {
      return this.addChild(new Output(this.self()));
   }

   @Override
   default Embed<T> embed() {
      return this.addChild(new Embed(this.self()));
   }

   @Override
   default Abbr<T> abbr() {
      return this.addChild(new Abbr(this.self()));
   }

   @Override
   default Area<T> area() {
      return this.addChild(new Area(this.self()));
   }

   @Override
   default Canvas<T> canvas() {
      return this.addChild(new Canvas(this.self()));
   }

   @Override
   default Meter<T> meter() {
      return this.addChild(new Meter(this.self()));
   }

   @Override
   default Var<T> var() {
      return this.addChild(new Var(this.self()));
   }

   @Override
   default Em<T> em() {
      return this.addChild(new Em(this.self()));
   }

   @Override
   default Dfn<T> dfn() {
      return this.addChild(new Dfn(this.self()));
   }

   @Override
   default Script<T> script() {
      return this.addChild(new Script(this.self()));
   }

   @Override
   default Input<T> input() {
      return this.addChild(new Input(this.self()));
   }

   @Override
   default Meta<T> meta() {
      return this.addChild(new Meta(this.self()));
   }

   @Override
   default Noscript<T> noscript() {
      return this.addChild(new Noscript(this.self()));
   }

   @Override
   default Object<T> object() {
      return this.addChild(new Object(this.self()));
   }

   @Override
   default Sub<T> sub() {
      return this.addChild(new Sub(this.self()));
   }

   @Override
   default Img<T> img() {
      return this.addChild(new Img(this.self()));
   }

   @Override
   default Strong<T> strong() {
      return this.addChild(new Strong(this.self()));
   }

   @Override
   default Code<T> code() {
      return this.addChild(new Code(this.self()));
   }

   @Override
   default Samp<T> samp() {
      return this.addChild(new Samp(this.self()));
   }

   @Override
   default Link<T> link() {
      return this.addChild(new Link(this.self()));
   }

   @Override
   default Video<T> video() {
      return this.addChild(new Video(this.self()));
   }

   @Override
   default Keygen<T> keygen() {
      return this.addChild(new Keygen(this.self()));
   }

   @Override
   default Sup<T> sup() {
      return this.addChild(new Sup(this.self()));
   }

   @Override
   default Br<T> br() {
      return this.addChild(new Br(this.self()));
   }

   @Override
   default Button<T> button() {
      return this.addChild(new Button(this.self()));
   }

   @Override
   default Audio<T> audio() {
      return this.addChild(new Audio(this.self()));
   }

   @Override
   default Iframe<T> iframe() {
      return this.addChild(new Iframe(this.self()));
   }

   @Override
   default Map<T> map() {
      return this.addChild(new Map(this.self()));
   }

   @Override
   default A<T> a() {
      return this.addChild(new A(this.self()));
   }

   @Override
   default B<T> b() {
      return this.addChild(new B(this.self()));
   }

   @Override
   default Datalist<T> datalist() {
      return this.addChild(new Datalist(this.self()));
   }

   @Override
   default Svg<T> svg() {
      return this.addChild(new Svg(this.self()));
   }

   @Override
   default I<T> i() {
      return this.addChild(new I(this.self()));
   }

   @Override
   default Label<T> label() {
      return this.addChild(new Label(this.self()));
   }

   @Override
   default Bdo<T> bdo() {
      return this.addChild(new Bdo(this.self()));
   }

   @Override
   default Kbd<T> kbd() {
      return this.addChild(new Kbd(this.self()));
   }

   @Override
   default Command<T> command() {
      return this.addChild(new Command(this.self()));
   }

   @Override
   default Ins<T> ins() {
      return this.addChild(new Ins(this.self()));
   }

   @Override
   default Ruby<T> ruby() {
      return this.addChild(new Ruby(this.self()));
   }

   @Override
   default Q<T> q() {
      return this.addChild(new Q(this.self()));
   }

   @Override
   default Cite<T> cite() {
      return this.addChild(new Cite(this.self()));
   }

   @Override
   default Progress<T> progress() {
      return this.addChild(new Progress(this.self()));
   }

   @Override
   default Time<T> time() {
      return this.addChild(new Time(this.self()));
   }

   @Override
   default Mark<T> mark() {
      return this.addChild(new Mark(this.self()));
   }

   @Override
   default Span<T> span() {
      return this.addChild(new Span(this.self()));
   }
}
