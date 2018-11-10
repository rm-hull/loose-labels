# Background

A Clojure implementation of **"Nice numbers for graph labels"** from
_Graphics Gems, vol. 1_, originally by Paul S. Heckbert, University of California,
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
