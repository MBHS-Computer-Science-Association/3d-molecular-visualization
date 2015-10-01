#include "Reaction.h"


string Reaction::type;

void Reaction::setRxnType(string rxn)
{
    type = rxn;
}

string Reaction::getRxnType()
{
    return type;
}
