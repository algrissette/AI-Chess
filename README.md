# AI-Chess
# Alpha-Beta Chess Agent

## Overview
This project implements an Alpha-Beta pruning algorithm to play chess using the SEPIA framework. It includes custom heuristics and move ordering functionalities to optimize the agent's performance.

## Setup
1. **Download and Unzip**: Download the hw2 package from Piazza and unzip it.
2. **Directories**: The package contains two main directories: `src` and `data`.

### Moving Files to the Right Place
1. **Source Code**:
   - Copy the `src/hw2` directory to your workspace. 
   - In your workspace, place it inside the `src` folder if you're using an IDE like Eclipse or IntelliJ.

2. **Data**:
   - Copy the `data/hw2` directory to the `data` folder in your workspace.

### Run Configurations
1. **Random vs. Random**:
   - Create a run configuration to execute `data/hw2/RandomvsRandom.xml`.
   - Name it `hw2 random vs random`.

2. **Minimax vs. Random**:
   - Create a run configuration for `data/hw2/MinimaxvsRandom.xml`.

3. **AlphaBeta Configurations**:
   - Create configurations for each `.xml` file with "AlphaBeta" in the name to test your Alpha-Beta solution against different opponents.

## Goal
The goal is to have an agent that:
1. Implements the Alpha-Beta pruning algorithm.
2. Uses custom heuristics for better evaluation.
3. Orders moves optimally to improve performance.

## Key Files
- `src/hw2/agents/AlphaBetaAgent.java`: Implements the Alpha-Beta pruning algorithm.
- `src/hw2/agents/heuristics/CustomHeuristics.java`: Contains heuristic functions.
- `src/hw2/agents/moveorder/CustomMoveOrderer.java`: Implements custom move ordering.

## Implementation Details
### Alpha-Beta Pruning Agent
1. **AlphaBetaAgent.AlphaBetaSearcher.alphaBetaSearch**:
   - Calculates the optimal plan as a stack of `MapLocation` objects.
   
2. **AlphaBetaAgent.DEFAULTMAXDEPTH**:
   - Sets the maximum search depth for the agent.

### Custom Heuristics
- Develop heuristics based on board position, strategy, piece formation, etc.

### Custom Move Orderer
- Implement move ordering to prioritize better moves, possibly making it piece-dependent and context-dependent.

## Grading
The project is evaluated based on:
- Code quality and readability.
- Correctness of the Alpha-Beta algorithm.
- Effectiveness of custom heuristics and move ordering.
- The agent's ability to play a full game of chess.
- Bonus points for completing a game in under 8 minutes.

## Running the Project
1. Set up the run configurations as described.
2. Test the agent by running the configurations.
3. Adjust the `DEFAULTMAXDEPTH` parameter for optimal performance.

## Contact
For any questions, feel free to reach out!

Good luck!
