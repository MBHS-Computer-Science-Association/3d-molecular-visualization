#include "Element.h"

Element::Element(int atomicNumber)
{
    this.atomicNumber = atomicNumber;
}

int Element::atomicNumber;

int Element::getAtomicNumber()
{
    return atomicNumber;
}

void Element::setAtomicNumber(int value)
{
    atomicNumber = value;
}
