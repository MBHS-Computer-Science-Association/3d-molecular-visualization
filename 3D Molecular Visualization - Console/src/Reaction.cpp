#include "Reaction.h"
#include <string>

std::string Reaction::type;

void Reaction::setRxnType(string rxn)
{
    type = rxn;
}

string Reaction::getRxnType()
{
    return type;
}
