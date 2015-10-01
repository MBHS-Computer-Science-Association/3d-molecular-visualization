#include "Element.h"



Element::Element()
{

}
// int Element::atomicNumber;
Element::Element(int value)
{
    setAtomicNumber(value);
}


int Element::getAtomicNumber()
{
    return atomicNumber;
}

void Element::setAtomicNumber(int value)
{
    atomicNumber = value;
}
