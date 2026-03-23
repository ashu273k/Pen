# Pen Design Requirements

## Factory Creation
- Objects of the pen should be created through a factory
- Factory should accept arguments:
  - Type of pen (ball point, fountain, gel)
  - Color of ink
  - Whether it has a cap or click functionality

## Pen Functionality
1. **Start**
   - Puts the pen in a state where it can write
   - If not started, the write method should throw an exception

2. **Write**
   - Accepts a string as input
   - Prints the string as output
   - Should reduce ink based on usage
   - Throws exception if pen is not started or out of ink

3. **Close**
   - Puts the pen back in a capped/closed state
   - Write method should throw exception after closing

4. **Refill**
   - All pens can be refilled
   - Accepts color as an argument
   - Different behavior for different pen types

## Pen Types
- Ball point pen
- Fountain pen
- Gel pen

## Additional Considerations
- Ink level should be tracked (starts at 100%)
- Different ink reduction rates for different pen types
- Write method should print indicator of pen type before the actual text
- Start/Close behavior differs based on cap vs. click functionality