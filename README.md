# Loose Labels [![Build Status](https://travis-ci.org/rm-hull/loose-labels.svg?branch=master)](http://travis-ci.org/rm-hull/loose-labels) [![Coverage Status](https://coveralls.io/repos/rm-hull/loose-labels/badge.svg?branch=master)](https://coveralls.io/r/rm-hull/loose-labels?branch=master) [![Dependencies Status](https://jarkeeper.com/rm-hull/loose-labels/status.svg)](https://jarkeeper.com/rm-hull/loose-labels) [![Downloads](https://jarkeeper.com/rm-hull/loose-labels/downloads.svg)](https://jarkeeper.com/rm-hull/loose-labels) [![Clojars Project](https://img.shields.io/clojars/v/rm-hull/loose-labels.svg)](https://clojars.org/rm-hull/loose-labels)

A Clojure implementation of **"Nice numbers for graph labels"** from
_Graphics Gems, vol. 1_, originally by Paul S. Heckbert, Uversity of California
Berkeley, California.

> When creating a graph by computer, it is desirable to label the x and y
> axes with “nice” numbers: simple decimal numbers. For example, if the
> data range is 105 to 543, we’d probably want to plot the range from 100
> to 600 and put tick marks every 100 units (see Fig. 1). Or if the data range
> is 2.03 to 2.17, we’d probably plot a range from 2.00 to 2.20 with a tick
> spacing of .05. Humans are good at choosing such “nice” numbers, but
> simplistic algorithms are not. The naive label-selection algorithm takes
> the data range and divides it into n equal intervals, but this usually
> results in ugly tick labels. We here describe a simple method for generat-
> ing nice graph labels.
>
> The primary observation is that the “nicest” numbers in decimal are 1,
> 2, and 5, and all power-of-ten multiples of these numbers. We will use
> only such numbers for the tick spacing, and place tick marks at multiples
> of the tick spacing. We choose the minimum and maximum of the
> graphed range in either of two ways: (a) loose: round the data minimum
>
> ![labels](https://raw.githubusercontent.com/rm-hull/loose-labels/master/labels.png)
>
> down, and the data maximum up, to compute the graph minimum and
> maximum, respectively, or (b) tight: use the data minimum and maximum
> for the graph minimum and maximum. The relative merits of these two
> approaches are discussed in Tufte (1983).

This is an implementation of the loose method.

### Pre-requisites

You will need [Leiningen](https://github.com/technomancy/leiningen) 2.6.1 or above installed.

### Building

To build and install the library locally, run:

    $ cd loose-labels
    $ lein test
    $ lein install

### Including in your project

There is a version hosted at [Clojars](https://clojars.org/rm-hull/loose-labels).
For leiningen include a dependency:

```clojure
[rm-hull/loose-labels "0.1.0"]
```

For maven-based projects, add the following to your `pom.xml`:

```xml
<dependency>
  <groupId>rm-hull</groupId>
  <artifactId>loose-labels</artifactId>
  <version>0.1.0</version>
</dependency>
```

## Basic Usage

TODO

## References

* https://books.google.co.uk/books?id=Mqn8BAAAQBAJ&pg=PA61#v=onepage&q&f=false
* http://www.realtimerendering.com/resources/GraphicsGems/gems/Label.c
* http://vis.stanford.edu/files/2010-TickLabels-InfoVis.pdf

## License

The MIT License (MIT)

Copyright (c) 2016 Richard Hull

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
